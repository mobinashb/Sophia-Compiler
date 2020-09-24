package main.compileErrorException.typeErrors;

import main.compileErrorException.CompileErrorException;

public class IncDecOperandNotLvalue extends CompileErrorException {

    //type: 0->inc  1->dec
    public IncDecOperandNotLvalue(int line, int type) {
        super(line, "Lvalue required as " + ((type==0) ? "increment" : "decrement") + " operand");
    }

}
