package main.compileErrorException.typeErrors;

import main.ast.nodes.expression.NewClassInstance;
import main.compileErrorException.CompileErrorException;

public class ConstructorArgsNotMatchDefinition extends CompileErrorException {

    public ConstructorArgsNotMatchDefinition(NewClassInstance newClassInstance) {
        super(newClassInstance.getLine(), "Constructor args doesn't match class " + newClassInstance.getClassType().getClassName().getName() + "'s constructor");
    }

}
