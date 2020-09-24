package main.compileErrorException.typeErrors;

import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.compileErrorException.CompileErrorException;

public class NoMainClassException extends CompileErrorException {

    public NoMainClassException() {
        super(1, "There is no class named Main");
    }

}
