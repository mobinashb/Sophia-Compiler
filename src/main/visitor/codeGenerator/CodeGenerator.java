package main.visitor.codeGenerator;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.values.ListValue;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.expression.values.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.loop.BreakStmt;
import main.ast.nodes.statement.loop.ContinueStmt;
import main.ast.nodes.statement.loop.ForStmt;
import main.ast.nodes.statement.loop.ForeachStmt;
import main.ast.types.NullType;
import main.ast.types.Type;
import main.ast.types.functionPointer.FptrType;
import main.ast.types.list.ListNameType;
import main.ast.types.list.ListType;
import main.ast.types.single.BoolType;
import main.ast.types.single.ClassType;
import main.ast.types.single.IntType;
import main.ast.types.single.StringType;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.FieldSymbolTableItem;
import main.symbolTable.utils.graph.Graph;
import main.visitor.Visitor;
import main.visitor.typeChecker.ExpressionTypeChecker;

import java.io.*;

public class CodeGenerator extends Visitor<String> {
    ExpressionTypeChecker expressionTypeChecker;
    Graph<String> classHierarchy;
    private String outputPath;
    private int labelCounter;
    private FileWriter currentFile;
    private ClassDeclaration currentClass;
    private MethodDeclaration currentMethod;
    private String currentForLoopExitLabel;
    private String currentForLoopStartLabel;
    private int tempVarSlot;

    public CodeGenerator(Graph<String> classHierarchy) {
        this.classHierarchy = classHierarchy;
        this.expressionTypeChecker = new ExpressionTypeChecker(classHierarchy);
        this.labelCounter = 0;
        this.tempVarSlot = 0;
        this.prepareOutputFolder();
    }

    private void prepareOutputFolder() {
        this.outputPath = "output/";
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e) { }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");
    }

    private void copyFile(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e) { }
    }

    private void createFile(String name) {
        try {
            String path = this.outputPath + name + ".j";
            File file = new File(path);
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(path);
            this.currentFile = fileWriter;
        } catch (IOException e) {}
    }

    private void addCommand(String command) {
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                this.currentFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                this.currentFile.write(command + "\n");
            else
                this.currentFile.write("\t\t" + command + "\n");
            this.currentFile.flush();
        } catch (IOException e) {}
    }

    private String makeTypeSignature(Type t) {
        if(t instanceof NullType)
            return "V";
        else
            return "L" + getClass(t) + ";";
    }

    private String getClass(Type t) {
        if(t instanceof IntType){
            return "java/lang/Integer";
        }
        else if(t instanceof BoolType){
            return "java/lang/Boolean";
        }
        else if(t instanceof StringType){
            return "java/lang/String";
        }
        else if(t instanceof ListType){
            return "List";
        }
        else if(t instanceof FptrType){
            return "Fptr";
        }
        else if(t instanceof ClassType){
            return ((ClassType) t).getClassName().getName();
        }
        return "";
    }

    private String getFreshLabel() {
        return "Label_" + this.labelCounter++;
    }

    private void addDefaultConstructor() {
        addCommand(".method public <init>()V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        addCommand("aload 0");
        if(currentClass.getParentClassName() == null)
            addCommand("invokespecial java/lang/Object/<init>()V");
        else
            addCommand("invokespecial " + currentClass.getParentClassName().getName() + "/<init>()V");
        for(FieldDeclaration fieldDeclaration : currentClass.getFields())
            this.initializeVar(fieldDeclaration.getVarDeclaration(), true);
        addCommand("return");
        addCommand(".end method\n ");
    }

    private void addStaticMainMethod() {
        addCommand(".method public static main([Ljava/lang/String;)V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        addCommand("new Main");
        addCommand("invokespecial Main/<init>()V");
        addCommand("return");
        addCommand(".end method\n ");
    }

    private int slotOf(String identifier) {
        int count = 1;
        if(currentMethod == null)
            return tempVarSlot++;
        for (VarDeclaration varDeclaration : currentMethod.getArgs()) {
            if (varDeclaration.getVarName().getName().equals(identifier))
                return count;
            count++;
        }
        for (VarDeclaration varDeclaration : currentMethod.getLocalVars()) {
            if (varDeclaration.getVarName().getName().equals(identifier))
                return count;
            count++;
        }
        //first empty var
        return count + (tempVarSlot++);
    }

    private void initializeVar(VarDeclaration varDeclaration, boolean isField) {
        Type type = varDeclaration.getType();
        String name = varDeclaration.getVarName().getName();
        String className = currentClass.getClassName().getName();
        if(isField)
            addCommand("aload 0");
        addCommand(this.generateValue(true, null, type));
        if(type instanceof IntType)
            addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
        else if(type instanceof BoolType)
            addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
        if(isField)
            addCommand("putfield " + className + "/" + name + " " + makeTypeSignature(type));
        else
            addCommand("astore " + slotOf(varDeclaration.getVarName().getName()));
    }

    private String generateValue(boolean isInitialization, Expression expr, Type type) {
        if(type instanceof IntType) {
            if(isInitialization)
                return this.visit(new IntValue(0));
            else
                return expr.accept(this);
        }
        else if(type instanceof StringType) {
            if(isInitialization)
                return this.visit(new StringValue(""));
            else
                return expr.accept(this);
        }
        else if(type instanceof BoolType) {
            if(isInitialization)
                return this.visit(new BoolValue(false));
            else
                return expr.accept(this);
        }
        else if(type instanceof ClassType || type instanceof FptrType || type instanceof NullType) {
            if(isInitialization)
                return "aconst_null";
            else
                return expr.accept(this);
        }
        else if(type instanceof ListType) {
            String commands = "";
            commands += "new java/util/ArrayList\n";
            commands += "dup\n";
            commands += "invokespecial java/util/ArrayList/<init>()V\n";
            int tempVar = slotOf("");
            commands += "astore " + tempVar + "\n";
            if(isInitialization)
                for(ListNameType listNameType : ((ListType) type).getElementsTypes()) {
                    commands += "aload " + tempVar + "\n";
                    commands += this.generateValue(true, null, listNameType.getType()) + "\n";
                    if(listNameType.getType() instanceof IntType)
                        commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    else if(listNameType.getType() instanceof BoolType)
                        commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                    commands += "invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n";
                    commands += "pop\n";
                }
            else
                for(Expression expression : ((ListValue) expr).getElements()) {
                    commands += "aload " + tempVar + "\n";
                    commands += expression.accept(this) + "\n";
                    Type t = expression.accept(expressionTypeChecker);
                    if(t instanceof IntType)
                        commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    else if(t instanceof BoolType)
                        commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                    commands += "invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n";
                    commands += "pop\n";
                }
            commands += "new List\n";
            commands += "dup\n";
            commands += "aload " + tempVar + "\n";
            commands += "invokespecial List/<init>(Ljava/util/ArrayList;)V";
            --(this.tempVarSlot);
            return commands;
        }
        return null;
    }

    @Override
    public String visit(Program program) {
        for(ClassDeclaration classDeclaration : program.getClasses()) {
            this.expressionTypeChecker.setCurrentClass(classDeclaration);
            this.currentClass = classDeclaration;
            classDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public String visit(ClassDeclaration classDeclaration) {
        String className = classDeclaration.getClassName().getName();
        createFile(className);
        addCommand(".class public " + className );
        if(classDeclaration.getParentClassName() != null)
            addCommand(".super " + classDeclaration.getParentClassName().getName() + "\n ");
        else
            addCommand(".super java/lang/Object\n ");
        for(FieldDeclaration fieldDeclaration : classDeclaration.getFields()) {
            fieldDeclaration.accept(this);
        }
        addCommand("");
        if(classDeclaration.getConstructor() != null) {
            this.expressionTypeChecker.setCurrentMethod(classDeclaration.getConstructor());
            this.currentMethod = classDeclaration.getConstructor();
            classDeclaration.getConstructor().accept(this);
        }
        else
            addDefaultConstructor();
        for(MethodDeclaration methodDeclaration : classDeclaration.getMethods()) {
            this.expressionTypeChecker.setCurrentMethod(methodDeclaration);
            this.currentMethod = methodDeclaration;
            methodDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public String visit(ConstructorDeclaration constructorDeclaration) {
        if(constructorDeclaration.getArgs().size() != 0)
            addDefaultConstructor();
        if (constructorDeclaration.getMethodName().getName().equals("Main"))
            this.addStaticMainMethod();
        this.visit((MethodDeclaration) constructorDeclaration);
        return null;
    }

    @Override
    public String visit(MethodDeclaration methodDeclaration) {
        String argsSignature = "";
        for(VarDeclaration arg : methodDeclaration.getArgs())
            argsSignature += makeTypeSignature(arg.getType());
        if(methodDeclaration instanceof ConstructorDeclaration)
            addCommand(".method public <init>(" + argsSignature + ")V");
        else
            addCommand(".method public " + methodDeclaration.getMethodName().getName() + "(" + argsSignature + ")" + makeTypeSignature(methodDeclaration.getReturnType()));
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        if(methodDeclaration instanceof ConstructorDeclaration) {
            addCommand("aload 0");
            if(currentClass.getParentClassName() == null)
                addCommand("invokespecial java/lang/Object/<init>()V");
            else
                addCommand("invokespecial " + currentClass.getParentClassName().getName() + "/<init>()V");
            for (FieldDeclaration fieldDeclaration : currentClass.getFields())
                this.initializeVar(fieldDeclaration.getVarDeclaration(), true);
        }
        for(VarDeclaration varDeclaration : methodDeclaration.getLocalVars())
            varDeclaration.accept(this);
        for(Statement statement : methodDeclaration.getBody())
            statement.accept(this);
        if(!methodDeclaration.getDoesReturn())
            addCommand("return");
        addCommand(".end method\n ");
        return null;
    }

    @Override
    public String visit(FieldDeclaration fieldDeclaration) {
        addCommand(".field " + fieldDeclaration.getVarDeclaration().getVarName().getName()
                + " " + makeTypeSignature(fieldDeclaration.getVarDeclaration().getType()));
        return null;
    }

    @Override
    public String visit(VarDeclaration varDeclaration) {
        this.initializeVar(varDeclaration, false);
        return null;
    }

    @Override
    public String visit(AssignmentStmt assignmentStmt) {
        String commands = this.visit(new BinaryExpression(assignmentStmt.getlValue(), assignmentStmt.getrValue(), BinaryOperator.assign));
        addCommand(commands);
        addCommand("pop");
        return null;
    }

    @Override
    public String visit(BlockStmt blockStmt) {
        for(Statement statement : blockStmt.getStatements())
            statement.accept(this);
        return null;
    }

    @Override
    public String visit(ConditionalStmt conditionalStmt) {
        String elseLabel = getFreshLabel();
        String exitLabel = getFreshLabel();
        addCommand(conditionalStmt.getCondition().accept(this));
        addCommand("ifeq " + elseLabel);
            conditionalStmt.getThenBody().accept(this);
        addCommand("goto " + exitLabel);
        addCommand(elseLabel + ":");
        if(conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        addCommand(exitLabel + ":");
        return null;
    }

    @Override
    public String visit(MethodCallStmt methodCallStmt) {
        expressionTypeChecker.setIsInMethodCallStmt(true);
        addCommand(methodCallStmt.getMethodCall().accept(this));
        expressionTypeChecker.setIsInMethodCallStmt(false);
        addCommand("pop");
        return null;
    }

    @Override
    public String visit(PrintStmt print) {
        addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
        addCommand(print.getArg().accept(this));
        Type type = print.getArg().accept(expressionTypeChecker);
        if (type instanceof IntType)
            addCommand("invokevirtual java/io/PrintStream/print(I)V");
        else if(type instanceof BoolType)
            addCommand("invokevirtual java/io/PrintStream/print(Z)V");
        else if (type instanceof StringType)
            addCommand("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
        return null;
    }

    @Override
    public String visit(ReturnStmt returnStmt) {
        Type type = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        if(type instanceof NullType)
            addCommand("return");
        else {
            addCommand(returnStmt.getReturnedExpr().accept(this));
            if(type instanceof IntType)
                addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
            else if(type instanceof BoolType)
                addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
            addCommand("areturn");
        }
        return null;
    }

    @Override
    public String visit(BreakStmt breakStmt) {
        addCommand("goto " + this.currentForLoopExitLabel);
        return null;
    }

    @Override
    public String visit(ContinueStmt continueStmt) {
        addCommand("goto " + this.currentForLoopStartLabel);
        return null;
    }

    @Override
    public String visit(ForeachStmt foreachStmt) {
        String loopStartLabel = getFreshLabel();
        String loopExitLabel = getFreshLabel();
        this.currentForLoopStartLabel = loopStartLabel;
        this.currentForLoopExitLabel = loopExitLabel;
        int tempVar = slotOf("");
        int forVarSlot = slotOf(foreachStmt.getVariable().getName());
        String listCommands = foreachStmt.getList().accept(this);
        //initialization
        addCommand("ldc 0");
        addCommand("istore " + tempVar);
        //condition
        addCommand(loopStartLabel + ":");
        addCommand("iload " + tempVar);
        addCommand(listCommands);
        addCommand("getfield List/elements Ljava/util/ArrayList;");
        addCommand("invokevirtual java/util/ArrayList/size()I");
        addCommand("if_icmpge " + loopExitLabel);
        //update
        addCommand(listCommands);
        addCommand("iload " + tempVar);
        addCommand("invokevirtual List/getElement(I)Ljava/lang/Object;");
        addCommand("checkcast " + getClass(foreachStmt.getVariable().accept(expressionTypeChecker)));
        addCommand("astore " + forVarSlot);
        addCommand("iinc " + tempVar + " 1");
        //body
        foreachStmt.getBody().accept(this);
        addCommand("goto " + loopStartLabel);
        addCommand(loopExitLabel + ":");
        --(this.tempVarSlot);
        return null;
    }

    @Override
    public String visit(ForStmt forStmt) {
        String loopStartLabel = getFreshLabel();
        String loopExitLabel = getFreshLabel();
        String updateLabel = getFreshLabel();
        this.currentForLoopStartLabel = updateLabel;
        this.currentForLoopExitLabel = loopExitLabel;
        if(forStmt.getInitialize() != null)
            forStmt.getInitialize().accept(this);
        addCommand(loopStartLabel + ":");
        if(forStmt.getCondition() != null) {
            addCommand(forStmt.getCondition().accept(this));
            addCommand("ifeq " + loopExitLabel);
        }
        if(forStmt.getBody() != null)
            forStmt.getBody().accept(this);
        addCommand(updateLabel + ":");
        if(forStmt.getUpdate() != null)
            forStmt.getUpdate().accept(this);
        addCommand("goto " + loopStartLabel);
        addCommand(loopExitLabel + ":");
        return null;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        BinaryOperator operator = binaryExpression.getBinaryOperator();
        String commands = "";
        if(!((operator == BinaryOperator.and) || (operator == BinaryOperator.or) || (operator == BinaryOperator.assign))) {
            commands += binaryExpression.getFirstOperand().accept(this) + "\n";
            commands += binaryExpression.getSecondOperand().accept(this) + "\n";
        }
        if (operator == BinaryOperator.add)
            commands += "iadd";
        else if (operator == BinaryOperator.sub)
            commands += "isub";
        else if (operator == BinaryOperator.mult)
            commands += "imul";
        else if (operator == BinaryOperator.div)
            commands += "idiv";
        else if (operator == BinaryOperator.mod)
            commands += "irem";
        else if((operator == BinaryOperator.gt) || (operator == BinaryOperator.lt)) {
            String falseLabel = getFreshLabel();
            String exitLabel = getFreshLabel();
            String command = (operator == BinaryOperator.gt) ? "if_icmple " : "if_icmpge ";
            commands += command + falseLabel + "\n";
            commands += "ldc 1" + "\n";
            commands += "goto " + exitLabel + "\n";
            commands += falseLabel + ":\n";
            commands += "ldc 0\n";
            commands += exitLabel + ":";
        }
        else if((operator == BinaryOperator.eq) || (operator == BinaryOperator.neq)) {
            Type type = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
            String falseLabel = getFreshLabel();
            String exitLabel = getFreshLabel();
            String compareCommand = "";
            if((type instanceof IntType) || (type instanceof BoolType))
                compareCommand += (operator == BinaryOperator.eq) ? "if_icmpne " : "if_icmpeq ";
            else
                compareCommand += (operator == BinaryOperator.eq) ? "if_acmpne " : "if_acmpeq ";
            commands += compareCommand + falseLabel + "\n";
            commands += "ldc 1" + "\n";
            commands += "goto " + exitLabel + "\n";
            commands += falseLabel + ":\n";
            commands += "ldc 0\n";
            commands += exitLabel + ":";
        }
        else if(operator == BinaryOperator.and) {
            String falseLabel = getFreshLabel();
            String exitLabel = getFreshLabel();
            commands += binaryExpression.getFirstOperand().accept(this) + "\n";
            commands += "ifeq " + falseLabel + "\n";
            commands += binaryExpression.getSecondOperand().accept(this) + "\n";
            commands += "ifeq " + falseLabel + "\n";
            commands += "ldc 1\n";
            commands += "goto " + exitLabel + "\n";
            commands += falseLabel + ":\n";
            commands += "ldc 0\n";
            commands += exitLabel + ":";

        }
        else if(operator == BinaryOperator.or) {
            String falseLabel = getFreshLabel();
            String exitLabel = getFreshLabel();
            commands += binaryExpression.getFirstOperand().accept(this) + "\n";
            commands += "ifne " + falseLabel + "\n";
            commands += binaryExpression.getSecondOperand().accept(this) + "\n";
            commands += "ifne " + falseLabel + "\n";
            commands += "ldc 0\n";
            commands += "goto " + exitLabel + "\n";
            commands += falseLabel + ":\n";
            commands += "ldc 1\n";
            commands += exitLabel + ":";
        }
        else if(operator == BinaryOperator.assign) {
            Type firstType = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
            String secondCommands = binaryExpression.getSecondOperand().accept(this);
            if(firstType instanceof ListType) {
                secondCommands = "new List" + "\n";
                secondCommands += "dup\n";
                secondCommands += binaryExpression.getSecondOperand().accept(this) + "\n";
                secondCommands += "invokespecial List/<init>(LList;)V";
            }
            if(binaryExpression.getFirstOperand() instanceof Identifier) {
                commands += secondCommands + "\n";
                commands += "dup\n";
                if(firstType instanceof IntType)
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                else if(firstType instanceof BoolType)
                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                int varSlot = slotOf(((Identifier) binaryExpression.getFirstOperand()).getName());
                commands += "astore " + varSlot;
            }
            else if(binaryExpression.getFirstOperand() instanceof ListAccessByIndex) {
                commands += ((ListAccessByIndex) binaryExpression.getFirstOperand()).getInstance().accept(this) + "\n";
                commands += ((ListAccessByIndex) binaryExpression.getFirstOperand()).getIndex().accept(this) + "\n";
                commands += secondCommands + "\n";
                commands += "dup_x2\n";
                if(firstType instanceof IntType)
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                else if(firstType instanceof BoolType)
                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                commands += "invokevirtual List/setElement(ILjava/lang/Object;)V";
            }
            else if(binaryExpression.getFirstOperand() instanceof ObjectOrListMemberAccess) {
                Expression instance = ((ObjectOrListMemberAccess) binaryExpression.getFirstOperand()).getInstance();
                Type memberType = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
                String memberName = ((ObjectOrListMemberAccess) binaryExpression.getFirstOperand()).getMemberName().getName();
                Type instanceType = instance.accept(expressionTypeChecker);
                if(instanceType instanceof ListType) {
                    int index = 0;
                    for(int i = 0; i < ((ListType) instanceType).getElementsTypes().size(); i++)
                        if(((ListType) instanceType).getElementsTypes().get(i).getName().getName().equals(memberName))
                            index = i;
                    commands += instance.accept(this) + "\n";
                    commands += "ldc " + index + "\n";
                    commands += secondCommands + "\n";
                    commands += "dup_x2\n";
                    if(firstType instanceof IntType)
                        commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    else if(firstType instanceof BoolType)
                        commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                    commands += "invokevirtual List/setElement(ILjava/lang/Object;)V";
                }
                else if(instanceType instanceof ClassType) {
                    String className = ((ClassType) instanceType).getClassName().getName();
                    commands += instance.accept(this) + "\n";
                    commands += secondCommands + "\n";
                    commands += "dup_x1\n";
                    if(firstType instanceof IntType)
                        commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    else if(firstType instanceof BoolType)
                        commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                    commands += "putfield " + className + "/" + memberName + " " + makeTypeSignature(memberType);
                }
            }
        }
        return commands;
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
        UnaryOperator operator = unaryExpression.getOperator();
        String commands = "";
        if(operator == UnaryOperator.minus) {
            commands += unaryExpression.getOperand().accept(this) + "\n";
            commands += "ineg";
        }
        else if(operator == UnaryOperator.not) {
            String falseLabel = getFreshLabel();
            String exitLabel = getFreshLabel();
            commands += unaryExpression.getOperand().accept(this) + "\n";
            commands += "ifne " + falseLabel + "\n";
            commands += "ldc 1" + "\n";
            commands += "goto " + exitLabel + "\n";
            commands += falseLabel + ":\n";
            commands += "ldc 0\n";
            commands += exitLabel + ":";
        }
        else if((operator == UnaryOperator.predec) || (operator == UnaryOperator.preinc)) {
            if(unaryExpression.getOperand() instanceof Identifier) {
                int varSlot = slotOf(((Identifier) unaryExpression.getOperand()).getName());
                commands += unaryExpression.getOperand().accept(this) + "\n";
                commands += "ldc 1\n";
                if(operator == UnaryOperator.predec)
                    commands += "isub\n";
                else
                    commands += "iadd\n";
                commands += "dup\n";
                commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                commands += "astore " + varSlot;
            }
            else if(unaryExpression.getOperand() instanceof ListAccessByIndex) {
                commands += ((ListAccessByIndex) unaryExpression.getOperand()).getInstance().accept(this) + "\n";
                commands += ((ListAccessByIndex) unaryExpression.getOperand()).getIndex().accept(this) + "\n";
                commands += "dup2\n";
                commands += "invokevirtual List/getElement(I)Ljava/lang/Object;\n";
                commands += "checkcast java/lang/Integer\n";
                commands += "invokevirtual java/lang/Integer/intValue()I\n";
                commands += "ldc 1\n";
                if(operator == UnaryOperator.predec)
                    commands += "isub\n";
                else
                    commands += "iadd\n";
                commands += "dup_x2\n";
                Type type = unaryExpression.getOperand().accept(expressionTypeChecker);
                if(type instanceof IntType)
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                else if(type instanceof BoolType)
                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                commands += "invokevirtual List/setElement(ILjava/lang/Object;)V";
            }
            else if(unaryExpression.getOperand() instanceof ObjectOrListMemberAccess) {
                Expression instance = ((ObjectOrListMemberAccess) unaryExpression.getOperand()).getInstance();
                Type memberType = unaryExpression.getOperand().accept(expressionTypeChecker);
                String memberName = ((ObjectOrListMemberAccess) unaryExpression.getOperand()).getMemberName().getName();
                Type instanceType = instance.accept(expressionTypeChecker);
                if(instanceType instanceof ListType) {
                    int index = 0;
                    for(int i = 0; i < ((ListType) instanceType).getElementsTypes().size(); i++)
                        if(((ListType) instanceType).getElementsTypes().get(i).getName().getName().equals(memberName))
                            index = i;
                    UnaryExpression newUnaryExpr = new UnaryExpression(new ListAccessByIndex(instance, new IntValue(index)), operator);
                    commands += newUnaryExpr.accept(this);
                }
                else if(instanceType instanceof ClassType) {
                    String className = ((ClassType) instanceType).getClassName().getName();
                    commands += instance.accept(this) + "\n";
                    commands += "dup\n";
                    commands += "getfield " + className + "/" + memberName + " " + makeTypeSignature(memberType) + "\n";
                    commands += "invokevirtual java/lang/Integer/intValue()I\n";
                    commands += "ldc 1\n";
                    if(operator == UnaryOperator.predec)
                        commands += "isub\n";
                    else
                        commands += "iadd\n";
                    commands += "dup_x1\n";
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    commands += "putfield " + className + "/" + memberName + " " + makeTypeSignature(memberType);
                }
            }
        }
        else if((operator == UnaryOperator.postdec) || (operator == UnaryOperator.postinc)) {
            if(unaryExpression.getOperand() instanceof Identifier) {
                int varSlot = slotOf(((Identifier) unaryExpression.getOperand()).getName());
                commands += unaryExpression.getOperand().accept(this) + "\n";
                commands += "dup\n";
                commands += "ldc 1\n";
                if(operator == UnaryOperator.postdec) {
                    commands += "isub\n";
                }
                else {
                    commands += "iadd\n";
                }
                commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                commands += "astore " + varSlot;
            }
            else if(unaryExpression.getOperand() instanceof ListAccessByIndex) {
                commands += ((ListAccessByIndex) unaryExpression.getOperand()).getInstance().accept(this) + "\n";
                commands +=  ((ListAccessByIndex) unaryExpression.getOperand()).getIndex().accept(this) + "\n";
                commands += "dup2\n";
                commands += "invokevirtual List/getElement(I)Ljava/lang/Object;\n";
                commands += "checkcast java/lang/Integer\n";
                commands += "invokevirtual java/lang/Integer/intValue()I\n";
                commands += "dup_x2\n";
                commands += "ldc 1\n";
                if(operator == UnaryOperator.postdec)
                    commands += "isub\n";
                else
                    commands += "iadd\n";
                commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                commands += "invokevirtual List/setElement(ILjava/lang/Object;)V";
            }
            else if(unaryExpression.getOperand() instanceof ObjectOrListMemberAccess) {
                Expression instance = ((ObjectOrListMemberAccess) unaryExpression.getOperand()).getInstance();
                Type memberType = unaryExpression.getOperand().accept(expressionTypeChecker);
                String memberName = ((ObjectOrListMemberAccess) unaryExpression.getOperand()).getMemberName().getName();
                Type instanceType = instance.accept(expressionTypeChecker);
                if(instanceType instanceof ListType) {
                    int index = 0;
                    for(int i = 0; i < ((ListType) instanceType).getElementsTypes().size(); i++)
                        if(((ListType) instanceType).getElementsTypes().get(i).getName().getName().equals(memberName))
                            index = i;
                    UnaryExpression newUnaryExpr = new UnaryExpression(new ListAccessByIndex(instance, new IntValue(index)), operator);
                    commands += newUnaryExpr.accept(this);
                }
                else if(instanceType instanceof ClassType) {
                    String className = ((ClassType) instanceType).getClassName().getName();
                    commands += instance.accept(this) + "\n";
                    commands += "dup\n";
                    commands += "getfield " + className + "/" + memberName + " " + makeTypeSignature(memberType) + "\n";
                    commands += "invokevirtual java/lang/Integer/intValue()I\n";
                    commands += "dup_x1\n";
                    commands += "ldc 1\n";
                    if(operator == UnaryOperator.postdec)
                        commands += "isub\n";
                    else
                        commands += "iadd\n";
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    commands += "putfield " + className + "/" + memberName + " " + makeTypeSignature(memberType);
                }
            }
        }
        return commands;
    }

    @Override
    public String visit(ObjectOrListMemberAccess objectOrListMemberAccess) {
        Type memberType = objectOrListMemberAccess.accept(expressionTypeChecker);
        Type instanceType = objectOrListMemberAccess.getInstance().accept(expressionTypeChecker);
        String memberName = objectOrListMemberAccess.getMemberName().getName();
        String commands = "";
        if(instanceType instanceof ClassType) {
            String className = ((ClassType) instanceType).getClassName().getName();
            try {
                SymbolTable classSymbolTable = ((ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + className, true)).getClassSymbolTable();
                try {
                    classSymbolTable.getItem(FieldSymbolTableItem.START_KEY + memberName, true);
                    commands += objectOrListMemberAccess.getInstance().accept(this) + "\n";
                    commands += "getfield " + className + "/" + memberName + " " + makeTypeSignature(memberType);
                    if(memberType instanceof IntType)
                        commands += "\ninvokevirtual java/lang/Integer/intValue()I";
                    else if(memberType instanceof  BoolType)
                        commands += "\ninvokevirtual java/lang/Boolean/booleanValue()Z";
                } catch (ItemNotFoundException memberIsMethod) {
                    commands += "new Fptr\n";
                    commands += "dup\n";
                    commands += objectOrListMemberAccess.getInstance().accept(this) + "\n";
                    commands += "ldc \"" + memberName + "\"\n";
                    commands += "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V";
                }
            } catch (ItemNotFoundException classNotFound) {
            }
        }
        else if(instanceType instanceof ListType) {
            commands += objectOrListMemberAccess.getInstance().accept(this) + "\n";
            int index = 0;
            for(int i = 0; i < ((ListType) instanceType).getElementsTypes().size(); i++)
                if(((ListType) instanceType).getElementsTypes().get(i).getName().getName().equals(memberName))
                    index = i;
            commands += "ldc " + index + "\n";
            commands += "invokevirtual List/getElement(I)Ljava/lang/Object;\n";
            commands += "checkcast " + getClass(memberType);
            if(memberType instanceof IntType)
                commands += "\ninvokevirtual java/lang/Integer/intValue()I";
            else if(memberType instanceof  BoolType)
                commands += "\ninvokevirtual java/lang/Boolean/booleanValue()Z";
        }
        return commands;
    }

    @Override
    public String visit(Identifier identifier) {
        String commands = "";
        Type type = identifier.accept(expressionTypeChecker);
        commands += "aload " + slotOf(identifier.getName());
        if(type instanceof IntType)
            commands += "\ninvokevirtual java/lang/Integer/intValue()I";
        else if(type instanceof  BoolType)
            commands += "\ninvokevirtual java/lang/Boolean/booleanValue()Z";
        return commands;
    }

    @Override
    public String visit(ListAccessByIndex listAccessByIndex) {
        String commands = "";
        commands += listAccessByIndex.getInstance().accept(this) + "\n";
        commands += listAccessByIndex.getIndex().accept(this) + "\n";
        Type type = listAccessByIndex.accept(expressionTypeChecker);
        commands += "invokevirtual List/getElement(I)Ljava/lang/Object;\n";
        commands += "checkcast " + getClass(type);
        if(type instanceof IntType)
            commands += "\ninvokevirtual java/lang/Integer/intValue()I";
        else if(type instanceof BoolType)
            commands += "\ninvokevirtual java/lang/Boolean/booleanValue()Z";
        return commands;
    }

    @Override
    public String visit(MethodCall methodCall) {
        String commands = "";
        commands += "new java/util/ArrayList\n";
        commands += "dup\n";
        commands += "invokespecial java/util/ArrayList/<init>()V\n";
        int tempVar = slotOf("");
        commands += "astore " + tempVar + "\n";
        for(Expression arg : methodCall.getArgs()) {
            commands += "aload " + tempVar + "\n";
            commands += arg.accept(this) + "\n";
            Type argType = arg.accept(expressionTypeChecker);
            if(argType instanceof IntType)
                commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
            else if(argType instanceof BoolType)
                commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
            commands += "invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n";
            commands += "pop\n";
        }
        commands += methodCall.getInstance().accept(this) + "\n";
        commands += "aload " + tempVar + "\n";
        commands += "invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;\n";
        Type type = methodCall.accept(expressionTypeChecker);
        if(!(type instanceof NullType))
            commands += "\ncheckcast " + getClass(type);
        if(type instanceof IntType)
            commands += "\ninvokevirtual java/lang/Integer/intValue()I";
        else if(type instanceof  BoolType)
            commands += "\ninvokevirtual java/lang/Boolean/booleanValue()Z";
        --(this.tempVarSlot);
        return commands;
    }

    @Override
    public String visit(NewClassInstance newClassInstance) {
        String commands = "";
        String className = newClassInstance.getClassType().getClassName().getName();
        commands += "new " + className + "\n";
        commands += "dup\n";
        String argsSignature = "";
        for(Expression arg : newClassInstance.getArgs()) {
            commands += arg.accept(this) + "\n";
            Type argType = arg.accept(expressionTypeChecker);
            if(argType instanceof IntType)
                commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
            else if(argType instanceof BoolType)
                commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
            argsSignature += makeTypeSignature(arg.accept(expressionTypeChecker));
        }
        commands += "invokespecial " + className + "/<init>(" + argsSignature + ")V";
        return commands;
    }

    @Override
    public String visit(ThisClass thisClass) {
        return "aload 0";
    }

    @Override
    public String visit(ListValue listValue) {
        return this.generateValue(false, listValue, listValue.accept(expressionTypeChecker));
    }

    @Override
    public String visit(NullValue nullValue) {
        return "aconst_null";
    }

    @Override
    public String visit(IntValue intValue) {
        return "ldc " + intValue.getConstant();
    }

    @Override
    public String visit(BoolValue boolValue) {
        int boolIntVal = (boolValue.getConstant()) ? 1 : 0;
        return "ldc " + boolIntVal;
    }

    @Override
    public String visit(StringValue stringValue) {
        return "ldc \"" + stringValue.getConstant() + "\"";
    }

}