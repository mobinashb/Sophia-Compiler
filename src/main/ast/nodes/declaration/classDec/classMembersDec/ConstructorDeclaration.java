package main.ast.nodes.declaration.classDec.classMembersDec;

import main.ast.nodes.expression.Identifier;
import main.ast.nodes.statement.SuperStmt;
import main.ast.types.NullType;
import main.ast.types.Type;
import main.visitor.IVisitor;

public class ConstructorDeclaration extends MethodDeclaration{
    private SuperStmt superStmt;

    public ConstructorDeclaration(Identifier methodName) {
        super(methodName, new NullType());
    }

    public SuperStmt getSuperStmt() {
        return superStmt;
    }

    public void setSuperStmt(SuperStmt superStmt) {
        this.superStmt = superStmt;
    }

    @Override
    public String toString() {
        return "Constructor_" + this.methodName.getName();
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
