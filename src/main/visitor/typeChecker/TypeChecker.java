package main.visitor.typeChecker;

import main.ast.nodes.Node;
import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.loop.BreakStmt;
import main.ast.nodes.statement.loop.ContinueStmt;
import main.ast.nodes.statement.loop.ForStmt;
import main.ast.nodes.statement.loop.ForeachStmt;
import main.visitor.Visitor;

public class TypeChecker extends Visitor<Boolean> {

    private void print(Node node) {
        System.out.println(node.getLine() + ":" + node.toString());
    }

    @Override
    public Boolean visit(Program program) {
        print(program);
        for(ClassDeclaration classDeclaration : program.getClasses()) {
            classDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Boolean visit(ClassDeclaration classDeclaration) {
        print(classDeclaration);
        classDeclaration.getClassName().accept(this);
        if(classDeclaration.getParentClassName() != null) {
            classDeclaration.getParentClassName().accept(this);
        }
        for(FieldDeclaration fieldDeclaration : classDeclaration.getFields()) {
            fieldDeclaration.accept(this);
        }
        if(classDeclaration.getConstructor() != null) {
            classDeclaration.getConstructor().accept(this);
        }
        for(MethodDeclaration methodDeclaration : classDeclaration.getMethods()) {
            methodDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Boolean visit(ConstructorDeclaration constructorDeclaration) {
        print(constructorDeclaration);
        constructorDeclaration.getMethodName().accept(this);
        for(VarDeclaration varDeclaration : constructorDeclaration.getArgs()) {
            varDeclaration.accept(this);
        }
        if(constructorDeclaration.getSuperStmt() != null) {
            constructorDeclaration.getSuperStmt().accept(this);
        }
        for(VarDeclaration varDeclaration : constructorDeclaration.getLocalVars()) {
            varDeclaration.accept(this);
        }
        for(Statement statement : constructorDeclaration.getBody()) {
            statement.accept(this);
        }
        return null;
    }

    @Override
    public Boolean visit(MethodDeclaration methodDeclaration) {
        print(methodDeclaration);
        methodDeclaration.getMethodName().accept(this);
        for(VarDeclaration varDeclaration : methodDeclaration.getArgs()) {
            varDeclaration.accept(this);
        }
        for(VarDeclaration varDeclaration : methodDeclaration.getLocalVars()) {
            varDeclaration.accept(this);
        }
        for(Statement statement : methodDeclaration.getBody()) {
            statement.accept(this);
        }
        return null;
    }

    @Override
    public Boolean visit(FieldDeclaration fieldDeclaration) {
        print(fieldDeclaration);
        fieldDeclaration.getVarDeclaration().accept(this);
        return null;
    }

    @Override
    public Boolean visit(VarDeclaration varDeclaration) {
        print(varDeclaration);
        varDeclaration.getVarName().accept(this);
        return null;
    }

    @Override
    public Boolean visit(AssignmentStmt assignmentStmt) {
        print(assignmentStmt);
        assignmentStmt.getlValue().accept(this);
        assignmentStmt.getrValue().accept(this);
        return null;
    }

    @Override
    public Boolean visit(BlockStmt blockStmt) {
        print(blockStmt);
        for(Statement statement : blockStmt.getStatements()) {
            statement.accept(this);
        }
        return null;
    }

    @Override
    public Boolean visit(ConditionalStmt conditionalStmt) {
        print(conditionalStmt);
        conditionalStmt.getCondition().accept(this);
        conditionalStmt.getThenBody().accept(this);
        if(conditionalStmt.getElseBody() != null) {
            conditionalStmt.getElseBody().accept(this);
        }
        return null;
    }

    @Override
    public Boolean visit(MethodCallStmt methodCallStmt) {
        print(methodCallStmt);
        methodCallStmt.getMethodCall().accept(this);
        return null;
    }

    @Override
    public Boolean visit(PrintStmt print) {
        print(print);
        print.getArg().accept(this);
        return null;
    }

    @Override
    public Boolean visit(ReturnStmt returnStmt) {
        print(returnStmt);
        returnStmt.getReturnedExpr().accept(this);
        return null;
    }

    @Override
    public Boolean visit(BreakStmt breakStmt) {
        print(breakStmt);
        return null;
    }

    @Override
    public Boolean visit(ContinueStmt continueStmt) {
        print(continueStmt);
        return null;
    }

    @Override
    public Boolean visit(ForeachStmt foreachStmt) {
        print(foreachStmt);
        foreachStmt.getVariable().accept(this);
        foreachStmt.getList().accept(this);
        foreachStmt.getBody().accept(this);
        return null;
    }

    @Override
    public Boolean visit(ForStmt forStmt) {
        print(forStmt);
        if(forStmt.getInitialize() != null) {
            forStmt.getInitialize().accept(this);
        }
        if(forStmt.getCondition() != null) {
            forStmt.getCondition().accept(this);
        }
        if(forStmt.getUpdate() != null) {
            forStmt.getUpdate().accept(this);
        }
        forStmt.getBody().accept(this);
        return null;
    }

    @Override
    public Boolean visit(SuperStmt superStmt) {
        print(superStmt);
        for(Expression expression : superStmt.getArgs()) {
            expression.accept(this);
        }
        return null;
    }

}
