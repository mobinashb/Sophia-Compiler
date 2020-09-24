package main.compileErrorException.typeErrors;

import main.compileErrorException.CompileErrorException;

public class UnsupportedTypeForPrint extends CompileErrorException {

    public UnsupportedTypeForPrint(int line) {
        super(line, "Unsupported print type");
    }

}
