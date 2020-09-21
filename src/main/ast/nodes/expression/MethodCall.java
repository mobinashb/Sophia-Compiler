package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class MethodCall extends Expression {
    private Expression instance;
    private Identifier methodName;

    public MethodCall(Expression instance, Identifier methodName) {
        this.instance = instance;
        this.methodName = methodName;
    }

    public Expression getInstance() {
        return instance;
    }

    public void setInstance(Expression instance) {
        this.instance = instance;
    }

    public Identifier getMethodName() {
        return methodName;
    }

    public void setMethodName(Identifier methodName) {
        this.methodName = methodName;
    }

    @Override
    public String toString() {
        return "MethodCall_" + this.methodName.getName();
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
