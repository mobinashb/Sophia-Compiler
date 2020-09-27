package main.compileErrorException.typeErrors;

import main.compileErrorException.CompileErrorException;

public class ForeachCantIterateNoneList extends CompileErrorException {

    public ForeachCantIterateNoneList(int line) {
        super(line, "Foreach cannot iterate on a none list type");
    }

}
