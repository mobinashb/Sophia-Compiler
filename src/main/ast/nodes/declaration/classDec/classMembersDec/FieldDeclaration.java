package main.ast.nodes.declaration.classDec.classMembersDec;

import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.ast.nodes.expression.Identifier;
import main.ast.types.Type;
import main.visitor.IVisitor;

public class FieldDeclaration extends VarDeclaration {

    public FieldDeclaration(Identifier varName, Type type) {
        super(varName, type);
    }

    @Override
    public String toString() {
        return "FieldDeclaration_" + this.varName.getName();
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
