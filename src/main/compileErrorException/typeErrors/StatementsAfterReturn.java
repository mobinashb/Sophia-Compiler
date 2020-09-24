package main.compileErrorException.typeErrors;

import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.statement.Statement;
import main.compileErrorException.CompileErrorException;

public class StatementsAfterReturn extends CompileErrorException {

    public StatementsAfterReturn(Statement statement) {
        super(statement.getLine(), "Statements are after return statement");
    }

}
