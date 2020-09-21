package main.ast.nodes.expression;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class NewClassInstance extends Expression{
    private Identifier className;
    private ArrayList<Expression> args = new ArrayList<>();

    public NewClassInstance(Identifier className) {
        this.className = className;
    }

    public NewClassInstance(Identifier className, ArrayList<Expression> args) {
        this.className = className;
        this.args = args;
    }

    public Identifier getClassName() {
        return className;
    }

    public void setClassName(Identifier className) {
        this.className = className;
    }

    public ArrayList<Expression> getArgs() {
        return args;
    }

    public void setArgs(ArrayList<Expression> args) {
        this.args = args;
    }

    public void addArg(Expression arg) {
        this.args.add(arg);
    }

    @Override
    public String toString() {
        return "NewClassInstance_" + this.className.getName();
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
