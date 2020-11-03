package main.visitor.typeChecker;

import main.ast.nodes.Node;
import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.ast.nodes.expression.MethodCall;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.loop.BreakStmt;
import main.ast.nodes.statement.loop.ContinueStmt;
import main.ast.nodes.statement.loop.ForStmt;
import main.ast.nodes.statement.loop.ForeachStmt;
import main.ast.types.NoType;
import main.ast.types.NullType;
import main.ast.types.Type;
import main.ast.types.functionPointer.FptrType;
import main.ast.types.list.ListNameType;
import main.ast.types.list.ListType;
import main.ast.types.single.BoolType;
import main.ast.types.single.ClassType;
import main.ast.types.single.IntType;
import main.ast.types.single.StringType;
import main.compileErrorException.nameErrors.ClassInCyclicInheritance;
import main.compileErrorException.typeErrors.*;
import main.symbolTable.utils.graph.Graph;
import main.visitor.Visitor;

import java.util.ArrayList;

public class TypeChecker extends Visitor<RetConBreak> {
    private final Graph<String> classHierarchy;
    private final ExpressionTypeChecker expressionTypeChecker;
    private ClassDeclaration currentClass;
    private MethodDeclaration currentMethod;
    private boolean isInFor = false;

    public TypeChecker(Graph<String> classHierarchy) {
        this.classHierarchy = classHierarchy;
        this.expressionTypeChecker = new ExpressionTypeChecker(classHierarchy);
    }

    private void checkTypeValidation(Type type, Node node) {
        if(!(type instanceof ClassType || type instanceof FptrType || type instanceof ListType))
            return;
        if(type instanceof ListType) {
            ArrayList<ListNameType> types = ((ListType) type).getElementsTypes();
            if(types.size() == 0) {
                CannotHaveEmptyList exception = new CannotHaveEmptyList(node.getLine());
                node.addError(exception);
                return;
            }
            boolean flag = false;
            for(int i = 0; i < types.size()-1; i++) {
                for(int j = i+1; j < types.size(); j++) {
                    String first = types.get(i).getName().getName();
                    String second = types.get(j).getName().getName();
                    if(first.equals("") || second.equals(""))
                        continue;
                    if(first.equals(second)) {
                        DuplicateListId exception = new DuplicateListId(node.getLine());
                        node.addError(exception);
                        flag = true;
                        break;
                    }
                }
                if(flag)
                    break;
            }
            for(ListNameType listNameType : types)
                this.checkTypeValidation(listNameType.getType(), node);
        }
        if(type instanceof ClassType) {
            String className = ((ClassType)type).getClassName().getName();
            if(!this.classHierarchy.doesGraphContainNode(className)) {
                ClassNotDeclared exception = new ClassNotDeclared(node.getLine(), className);
                node.addError(exception);
            }
        }
        if(type instanceof FptrType) {
            Type retType = ((FptrType) type).getReturnType();
            ArrayList<Type> argsType = ((FptrType) type).getArgumentsTypes();
            this.checkTypeValidation(retType, node);
            for(Type argType : argsType)
                this.checkTypeValidation(argType, node);
        }
    }

    @Override
    public RetConBreak visit(Program program) {
        boolean mainCheck = false;
        for(ClassDeclaration classDeclaration : program.getClasses()) {
            this.expressionTypeChecker.setCurrentClass(classDeclaration);
            this.currentClass = classDeclaration;
            classDeclaration.accept(this);
            if(classDeclaration.getClassName().getName().equals("Main"))
                mainCheck = true;
        }
        if(!mainCheck) {
            NoMainClass exception = new NoMainClass();
            program.addError(exception);
        }
        return null;
    }

    @Override
    public RetConBreak visit(ClassDeclaration classDeclaration) {
        if(classDeclaration.getParentClassName() != null) {
            this.checkTypeValidation(new ClassType(classDeclaration.getParentClassName()), classDeclaration);
            if(classDeclaration.getClassName().getName().equals("Main")) {
                MainClassCantExtend exception = new MainClassCantExtend(classDeclaration.getLine());
                classDeclaration.addError(exception);
            }
            if(classDeclaration.getParentClassName().getName().equals("Main")) {
                CannotExtendFromMainClass exception = new CannotExtendFromMainClass(classDeclaration.getLine());
                classDeclaration.addError(exception);
            }
        }
        for(FieldDeclaration fieldDeclaration : classDeclaration.getFields()) {
            fieldDeclaration.accept(this);
        }
        if(classDeclaration.getConstructor() != null) {
            this.expressionTypeChecker.setCurrentMethod(classDeclaration.getConstructor());
            this.currentMethod = classDeclaration.getConstructor();
            boolean doesReturn = classDeclaration.getConstructor().accept(this).doesReturn;
            if(!doesReturn && !(classDeclaration.getConstructor().getReturnType() instanceof NullType)) {
                MissingReturnStatement exception = new MissingReturnStatement(classDeclaration.getConstructor());
                classDeclaration.getConstructor().addError(exception);
            }
        }
        else if(classDeclaration.getClassName().getName().equals("Main")) {
            NoConstructorInMainClass exception = new NoConstructorInMainClass(classDeclaration);
            classDeclaration.addError(exception);
        }
        for(MethodDeclaration methodDeclaration : classDeclaration.getMethods()) {
            this.expressionTypeChecker.setCurrentMethod(methodDeclaration);
            this.currentMethod = methodDeclaration;
            boolean doesReturn = methodDeclaration.accept(this).doesReturn;
            methodDeclaration.setDoesReturn(doesReturn);
            if(!doesReturn && !(methodDeclaration.getReturnType() instanceof NullType)) {
                MissingReturnStatement exception = new MissingReturnStatement(methodDeclaration);
                methodDeclaration.addError(exception);
            }
        }
        return null;
    }

    @Override
    public RetConBreak visit(ConstructorDeclaration constructorDeclaration) {
        if(!this.currentClass.getClassName().getName().equals(constructorDeclaration.getMethodName().getName())) {
            ConstructorNotSameNameAsClass exception = new ConstructorNotSameNameAsClass(constructorDeclaration.getLine());
            constructorDeclaration.addError(exception);
        }
        if(this.currentClass.getClassName().getName().equals("Main")) {
            if(constructorDeclaration.getArgs().size() != 0) {
                MainConstructorCantHaveArgs exception = new MainConstructorCantHaveArgs(constructorDeclaration.getLine());
                constructorDeclaration.addError(exception);
            }
        }
        return this.visit((MethodDeclaration) constructorDeclaration);
    }

    @Override
    public RetConBreak visit(MethodDeclaration methodDeclaration) {
        this.checkTypeValidation(methodDeclaration.getReturnType(), methodDeclaration);
        for(VarDeclaration varDeclaration : methodDeclaration.getArgs()) {
            varDeclaration.accept(this);
        }
        for(VarDeclaration varDeclaration : methodDeclaration.getLocalVars()) {
            varDeclaration.accept(this);
        }
        boolean doesReturn = false, erroredYet = false;
        for(Statement statement : methodDeclaration.getBody()) {
            if(doesReturn && !erroredYet) {
                UnreachableStatements exception = new UnreachableStatements(statement);
                statement.addError(exception);
                erroredYet = true;
            }
            doesReturn = doesReturn || statement.accept(this).doesReturn;
        }
        return new RetConBreak(doesReturn, false);
    }

    @Override
    public RetConBreak visit(FieldDeclaration fieldDeclaration) {
//        fieldDeclaration.getVarDeclaration().accept(this);
        return null;
    }

    @Override
    public RetConBreak visit(VarDeclaration varDeclaration) {
        this.checkTypeValidation(varDeclaration.getType(), varDeclaration);
        return null;
    }

    @Override
    public RetConBreak visit(AssignmentStmt assignmentStmt) {
        Type firstType = assignmentStmt.getlValue().accept(expressionTypeChecker);
        Type secondType = assignmentStmt.getrValue().accept(expressionTypeChecker);
        boolean isFirstLvalue = expressionTypeChecker.isLvalue(assignmentStmt.getlValue());
        if(!isFirstLvalue) {
            LeftSideNotLvalue exception = new LeftSideNotLvalue(assignmentStmt.getLine());
            assignmentStmt.addError(exception);
        }
        if(firstType instanceof NoType || secondType instanceof NoType) {
            return new RetConBreak(false, false);
        }
        boolean isSubtype = expressionTypeChecker.isFirstSubTypeOfSecond(secondType, firstType);
        if((assignmentStmt.getrValue() instanceof MethodCall && secondType instanceof NullType) || !isSubtype) {
            UnsupportedOperandType exception = new UnsupportedOperandType(assignmentStmt.getLine(), BinaryOperator.assign.name());
            assignmentStmt.addError(exception);
            return new RetConBreak(false, false);
        }
        return new RetConBreak(false, false);
    }

    @Override
    public RetConBreak visit(BlockStmt blockStmt) {
        boolean doesReturn = false, returnErroredYet= false;
        boolean doesContinueBreak = false, continueBreakErroredYet = false;
        for(Statement statement : blockStmt.getStatements()) {
            if(doesReturn && !returnErroredYet) {
                UnreachableStatements exception = new UnreachableStatements(statement);
                statement.addError(exception);
                returnErroredYet = true;
            }
            if(isInFor && doesContinueBreak && !continueBreakErroredYet) {
                UnreachableStatements exception = new UnreachableStatements(statement);
                statement.addError(exception);
                continueBreakErroredYet = true;
            }
            RetConBreak stmtRetConBreak = statement.accept(this);
            doesReturn = doesReturn || stmtRetConBreak.doesReturn;
            doesContinueBreak = doesContinueBreak || stmtRetConBreak.doesBreakContinue;
        }
        return new RetConBreak(doesReturn, doesContinueBreak);
    }

    @Override
    public RetConBreak visit(ConditionalStmt conditionalStmt) {
        Type condType = conditionalStmt.getCondition().accept(expressionTypeChecker);
        if(!(condType instanceof BoolType || condType instanceof NoType)) {
            ConditionNotBool exception = new ConditionNotBool(conditionalStmt.getLine());
            conditionalStmt.addError(exception);
        }
        RetConBreak thenRetConBreak = conditionalStmt.getThenBody().accept(this);
        if(conditionalStmt.getElseBody() != null) {
            RetConBreak elseRetConBreak = conditionalStmt.getElseBody().accept(this);
            return new RetConBreak(thenRetConBreak.doesReturn && elseRetConBreak.doesReturn,
                    thenRetConBreak.doesBreakContinue && elseRetConBreak.doesBreakContinue);
        }
        return new RetConBreak(false, false);
    }

    @Override
    public RetConBreak visit(MethodCallStmt methodCallStmt) {
        expressionTypeChecker.setIsInMethodCallStmt(true);
        methodCallStmt.getMethodCall().accept(expressionTypeChecker);
        expressionTypeChecker.setIsInMethodCallStmt(false);
        return new RetConBreak(false, false);
    }

    @Override
    public RetConBreak visit(PrintStmt print) {
        Type argType = print.getArg().accept(expressionTypeChecker);
        if(!(argType instanceof IntType || argType instanceof StringType ||
                argType instanceof BoolType || argType instanceof NoType)) {
            UnsupportedTypeForPrint exception = new UnsupportedTypeForPrint(print.getLine());
            print.addError(exception);
        }
        return new RetConBreak(false, false);
    }

    @Override
    public RetConBreak visit(ReturnStmt returnStmt) {
        Type retType = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        Type actualRetType = this.currentMethod.getReturnType();
        if(!expressionTypeChecker.isFirstSubTypeOfSecond(retType, actualRetType)) {
            ReturnValueNotMatchMethodReturnType exception = new ReturnValueNotMatchMethodReturnType(returnStmt);
            returnStmt.addError(exception);
        }
        return new RetConBreak(true, false);
    }

    @Override
    public RetConBreak visit(BreakStmt breakStmt) {
        if(!isInFor) {
            ContinueBreakNotInLoop exception = new ContinueBreakNotInLoop(breakStmt.getLine(), 0);
            breakStmt.addError(exception);
        }
        return new RetConBreak(false, true);
    }

    @Override
    public RetConBreak visit(ContinueStmt continueStmt) {
        if(!isInFor) {
            ContinueBreakNotInLoop exception = new ContinueBreakNotInLoop(continueStmt.getLine(), 1);
            continueStmt.addError(exception);
        }
        return new RetConBreak(false, true);
    }

    @Override
    public RetConBreak visit(ForeachStmt foreachStmt) {
        Type varType = foreachStmt.getVariable().accept(expressionTypeChecker);
        Type listType = foreachStmt.getList().accept(expressionTypeChecker);
        if(!(listType instanceof ListType || listType instanceof NoType)) {
            ForeachCantIterateNoneList exception = new ForeachCantIterateNoneList(foreachStmt.getLine());
            foreachStmt.addError(exception);
        }
        else if(!(listType instanceof NoType)) {
            ArrayList<Type> types = new ArrayList<>();
            for(ListNameType listNameType : ((ListType) listType).getElementsTypes())
                    types.add(listNameType.getType());
            if(!expressionTypeChecker.areAllSameType(types)) {
                ForeachListElementsNotSameType exception = new ForeachListElementsNotSameType(foreachStmt.getLine());
                foreachStmt.addError(exception);
            }
            else if(!expressionTypeChecker.isSameType(varType, types.get(0))) {
                ForeachVarNotMatchList exception = new ForeachVarNotMatchList(foreachStmt);
                foreachStmt.addError(exception);
            }
        }
        boolean lastIsInFor = this.isInFor;
        this.isInFor = true;
        foreachStmt.getBody().accept(this);
        this.isInFor = lastIsInFor;
        return new RetConBreak(false, false);
    }

    @Override
    public RetConBreak visit(ForStmt forStmt) {
        if(forStmt.getInitialize() != null) {
            forStmt.getInitialize().accept(this);
        }
        if(forStmt.getCondition() != null) {
            Type type = forStmt.getCondition().accept(expressionTypeChecker);
            if(!(type instanceof BoolType || type instanceof NoType)) {
                ConditionNotBool exception = new ConditionNotBool(forStmt.getLine());
                forStmt.addError(exception);
            }
        }
        if(forStmt.getUpdate() != null) {
            forStmt.getUpdate().accept(this);
        }
        boolean lastIsInFor = this.isInFor;
        this.isInFor = true;
        forStmt.getBody().accept(this);
        this.isInFor = lastIsInFor;
        return new RetConBreak(false, false);
    }

}
