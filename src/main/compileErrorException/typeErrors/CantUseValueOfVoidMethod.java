package main.compileErrorException.typeErrors;

import main.compileErrorException.CompileErrorException;

public class CantUseValueOfVoidMethod extends CompileErrorException {

    public CantUseValueOfVoidMethod(int line) {
        super(line, "Cannot use value of a method with void return type");
    }

}
