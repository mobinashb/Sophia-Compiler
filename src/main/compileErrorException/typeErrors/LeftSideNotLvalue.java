package main.compileErrorException.typeErrors;

import main.compileErrorException.CompileErrorException;

public class LeftSideNotLvalue extends CompileErrorException {

    public LeftSideNotLvalue(int line) {
        super(line, "Left side of assignment not a valid lvalue");
    }

}
