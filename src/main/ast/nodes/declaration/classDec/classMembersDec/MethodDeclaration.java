package main.ast.nodes.declaration.classDec.classMembersDec;

import main.ast.nodes.declaration.Declaration;
import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.ast.nodes.expression.Identifier;
import main.ast.nodes.statement.Statement;
import main.ast.nodes.statement.SuperStmt;
import main.ast.types.Type;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class MethodDeclaration extends Declaration {
    protected Identifier methodName;
    private Type returnType;
    private SuperStmt superStmt;
    private ArrayList<VarDeclaration> args = new ArrayList<>();
    private ArrayList<VarDeclaration> localVars = new ArrayList<>();
    private ArrayList<Statement> body = new ArrayList<>();

    //returnType NullType on when it is Void
    public MethodDeclaration(Identifier methodName, Type returnType) {
        this.methodName = methodName;
        this.returnType = returnType;
    }

    public Identifier getMethodName() {
        return methodName;
    }

    public void setMethodName(Identifier methodName) {
        this.methodName = methodName;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public ArrayList<VarDeclaration> getArgs() {
        return args;
    }

    public void setArgs(ArrayList<VarDeclaration> args) {
        this.args = args;
    }

    public ArrayList<VarDeclaration> getLocalVars() {
        return localVars;
    }

    public void setLocalVars(ArrayList<VarDeclaration> localVars) {
        this.localVars = localVars;
    }

    public ArrayList<Statement> getBody() {
        return body;
    }

    public void setBody(ArrayList<Statement> body) {
        this.body = body;
    }

    public SuperStmt getSuperStmt() {
        return superStmt;
    }

    public void setSuperStmt(SuperStmt superStmt) {
        this.superStmt = superStmt;
    }

    public void addArg(VarDeclaration varDeclaration) {
        this.args.add(varDeclaration);
    }

    public void addLocalVar(VarDeclaration varDeclaration) {
        this.localVars.add(varDeclaration);
    }

    public void addBodyStatement(Statement statement) {
        this.body.add(statement);
    }

    @Override
    public String toString() {
        return "MethodDeclaration_" + this.methodName.getName();
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
