package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class SuperStmt extends Statement{
    private ArrayList<Expression> args = new ArrayList<>();

    public SuperStmt() {
    }

    public SuperStmt(ArrayList<Expression> args) {
        this.args = args;
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
        return "SuperStmt";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
