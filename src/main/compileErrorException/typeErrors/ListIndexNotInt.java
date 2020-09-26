package main.compileErrorException.typeErrors;

import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.compileErrorException.CompileErrorException;

public class ListIndexNotInt extends CompileErrorException {

    public ListIndexNotInt(int line) {
        super(line, "List index is not an integer");
    }

}
