package main.compileErrorException.typeErrors;

import main.compileErrorException.CompileErrorException;

public class AccessWithIndexOnEmptyList extends CompileErrorException {

    public AccessWithIndexOnEmptyList(int line) {
        super(line, "Cant access empty list with index");
    }

}
