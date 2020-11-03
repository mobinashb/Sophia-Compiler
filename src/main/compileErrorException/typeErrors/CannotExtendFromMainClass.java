package main.compileErrorException.typeErrors;

import main.compileErrorException.CompileErrorException;

public class CannotExtendFromMainClass extends CompileErrorException {

    public CannotExtendFromMainClass(int line) {
        super(line, "Classes can't extend from Main class");
    }

}
