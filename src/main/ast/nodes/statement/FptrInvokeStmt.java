package main.ast.nodes.statement;

import main.ast.nodes.expression.FptrInvoke;
import main.visitor.IVisitor;

public class FptrInvokeStmt extends Statement{
    private FptrInvoke fptrInvoke;

    public FptrInvokeStmt(FptrInvoke fptrInvoke) {
        this.fptrInvoke = fptrInvoke;
    }

    public FptrInvoke getFptrInvoke() {
        return fptrInvoke;
    }

    public void setFptrInvoke(FptrInvoke fptrInvoke) {
        this.fptrInvoke = fptrInvoke;
    }

    @Override
    public String toString() {
        return "FptrInvokeStmt";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
