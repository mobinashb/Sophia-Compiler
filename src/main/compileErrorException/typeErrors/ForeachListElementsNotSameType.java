package main.compileErrorException.typeErrors;

import main.compileErrorException.CompileErrorException;

public class ForeachListElementsNotSameType extends CompileErrorException {

    public ForeachListElementsNotSameType(int line) {
        super(line, "Foreach list elements are not same type");
    }

}
