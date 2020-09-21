package main.ast.nodes;

import main.visitor.IVisitor;
import main.compileErrorException.CompileErrorException;

import java.util.ArrayList;

public abstract class Node {
    private int line;
    private ArrayList<CompileErrorException> errors = new ArrayList<>();

    public ArrayList<CompileErrorException> flushErrors() {
        ArrayList<CompileErrorException> errors = this.errors;
        this.errors = new ArrayList<>();
        return errors;
    }

    public void addError(CompileErrorException e) {
        this.errors.add(e);
    }

    public boolean hasError() {
        return this.errors.size() != 0;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public abstract String toString();

    public abstract <T> T accept(IVisitor<T> visitor);
}

