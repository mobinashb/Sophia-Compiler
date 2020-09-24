package main.compileErrorException.typeErrors;

import main.compileErrorException.CompileErrorException;

public class ListAccessByIndexOnNoneList extends CompileErrorException {

    public ListAccessByIndexOnNoneList(int line) {
        super(line, "Access with index on none list type");
    }

}
