package main.visitor.utils;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.ast.nodes.expression.*;
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
import main.visitor.Visitor;

public class Reporter extends Visitor<Integer> {
    
    @Override
    public Integer visit(Program program) {
        return 0;
    }

    @Override
    public Integer visit(ClassDeclaration classDeclaration) {
        return null;
    }

    @Override
    public Integer visit(ConstructorDeclaration constructorDeclaration) {
        return null;
    }

    @Override
    public Integer visit(MethodDeclaration methodDeclaration) {
        return null;
    }

    @Override
    public Integer visit(FieldDeclaration fieldDeclaration) {
        return null;
    }

    @Override
    public Integer visit(VarDeclaration varDeclaration) {
        return null;
    }

    @Override
    public Integer visit(AssignmentStmt assignmentStmt) {
        return null;
    }

    @Override
    public Integer visit(BlockStmt blockStmt) {
        return null;
    }

    @Override
    public Integer visit(ConditionalStmt conditionalStmt) {
        return null;
    }

    @Override
    public Integer visit(FptrInvokeStmt fptrInvokeStmt) {
        return null;
    }

    @Override
    public Integer visit(MethodCallStmt methodCallStmt) {
        return null;
    }

    @Override
    public Integer visit(PrintStmt print) {
        return null;
    }

    @Override
    public Integer visit(ReturnStmt returnStmt) {
        return null;
    }

    @Override
    public Integer visit(BreakStmt breakStmt) {
        return null;
    }

    @Override
    public Integer visit(ContinueStmt continueStmt) {
        return null;
    }

    @Override
    public Integer visit(ForeachStmt foreachStmt) {
        return null;
    }

    @Override
    public Integer visit(ForStmt forStmt) {
        return null;
    }

    @Override
    public Integer visit(SuperStmt superStmt) {
        return null;
    }

    @Override
    public Integer visit(BinaryExpression binaryExpression) {
        return null;
    }

    @Override
    public Integer visit(UnaryExpression unaryExpression) {
        return null;
    }

    @Override
    public Integer visit(FieldOrListAccess fieldOrListAccess) {
        return null;
    }

    @Override
    public Integer visit(FptrInvoke fptrInvoke) {
        return null;
    }

    @Override
    public Integer visit(Identifier identifier) {
        return null;
    }

    @Override
    public Integer visit(ListAccessByIndex listAccessByIndex) {
        return null;
    }

    @Override
    public Integer visit(MethodCall methodCall) {
        return null;
    }

    @Override
    public Integer visit(NewClassInstance newClassInstance) {
        return null;
    }

    @Override
    public Integer visit(ThisClass thisClass) {
        return null;
    }

    @Override
    public Integer visit(ListValue listValue) {
        return null;
    }

    @Override
    public Integer visit(NullValue nullValue) {
        return null;
    }

    @Override
    public Integer visit(IntValue intValue) {
        return null;
    }

    @Override
    public Integer visit(BoolValue boolValue) {
        return null;
    }

    @Override
    public Integer visit(StringValue stringValue) {
        return null;
    }

}
