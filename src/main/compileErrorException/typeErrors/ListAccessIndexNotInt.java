package main.compileErrorException.typeErrors;

import main.compileErrorException.CompileErrorException;

public class ListAccessIndexNotInt extends CompileErrorException {

    public ListAccessIndexNotInt(int line) {
        super(line, "List access index not int value");
    }

}
