package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class FptrInvoke extends Expression {
    private Expression instance;

    public FptrInvoke(Expression instance) {
        this.instance = instance;
    }

    public Expression getInstance() {
        return instance;
    }

    public void setInstance(Expression instance) {
        this.instance = instance;
    }

    @Override
    public String toString() {
        return "FptrInvoke";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
