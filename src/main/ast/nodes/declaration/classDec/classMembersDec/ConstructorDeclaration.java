package main.ast.nodes.declaration.classDec.classMembersDec;

import main.ast.nodes.expression.Identifier;
import main.ast.types.Type;
import main.visitor.IVisitor;

public class ConstructorDeclaration extends MethodDeclaration{

    public ConstructorDeclaration(Identifier methodName, Type returnType) {
        super(methodName, returnType);
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