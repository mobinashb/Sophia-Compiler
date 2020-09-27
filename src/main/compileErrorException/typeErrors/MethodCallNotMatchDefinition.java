package main.compileErrorException.typeErrors;

import main.ast.nodes.expression.MethodCall;
import main.ast.nodes.expression.NewClassInstance;
import main.compileErrorException.CompileErrorException;

public class MethodCallNotMatchDefinition extends CompileErrorException {

    public MethodCallNotMatchDefinition(int line) {
        super(line, "Args in method call doesn't match definition");
    }

}
