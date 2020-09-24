package main.compileErrorException.typeErrors;

import main.compileErrorException.CompileErrorException;

public class CallOnNoneFptrType extends CompileErrorException {

    public CallOnNoneFptrType(int line) {
        super(line, "Cannot call none fptr type");
    }

}
