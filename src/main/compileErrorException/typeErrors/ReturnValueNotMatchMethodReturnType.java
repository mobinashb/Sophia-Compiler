package main.compileErrorException.typeErrors;

import main.ast.nodes.statement.ReturnStmt;
import main.ast.nodes.statement.Statement;
import main.compileErrorException.CompileErrorException;

public class ReturnValueNotMatchMethodReturnType extends CompileErrorException {

    public ReturnValueNotMatchMethodReturnType(ReturnStmt returnStmt) {
        super(returnStmt.getLine(), "Return value does not match method return type");
    }

}