package main.compileErrorException.typeErrors;

import main.compileErrorException.CompileErrorException;

public class MemberAccessOnNoneObjOrListType extends CompileErrorException {

    public MemberAccessOnNoneObjOrListType(int line) {
        super(line, "object or list member access on expression that is neither list nor object");
    }

}
