package main.compileErrorException.typeErrors;

import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.compileErrorException.CompileErrorException;

public class NoMainClass extends CompileErrorException {

    public NoMainClass() {
        super(1, "Main class is not found");
    }

}
