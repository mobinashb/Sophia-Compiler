package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class FieldOrListAccess extends Expression{
    private Expression instance;
    private Identifier field;

    public FieldOrListAccess(Expression instance, Identifier field) {
        this.instance = instance;
        this.field = field;
    }

    public Expression getInstance() {
        return instance;
    }

    public void setInstance(Expression instance) {
        this.instance = instance;
    }

    public Identifier getField() {
        return field;
    }

    public void setField(Identifier field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "FieldOrListAccess_" + this.field.getName();
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
