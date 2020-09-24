package main.compileErrorException.typeErrors;

import main.compileErrorException.CompileErrorException;

public class SuperNotMatchAnyConstructor extends CompileErrorException {

    public SuperNotMatchAnyConstructor(int line) {
        super(line, "There is no constructor in this class's ancestors that match the super ");
    }

}
