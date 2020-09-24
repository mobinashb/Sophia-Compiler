package main.compileErrorException.nameErrors;

import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.compileErrorException.CompileErrorException;

public class LocalVarRedefinitionException extends CompileErrorException {

    public LocalVarRedefinitionException(VarDeclaration varDeclaration) {
        super(varDeclaration.getLine(), "Redefinition of local variable " + varDeclaration.getVarName().getName());
    }

}
