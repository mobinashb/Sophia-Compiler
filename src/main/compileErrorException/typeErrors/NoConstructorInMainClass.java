package main.compileErrorException.typeErrors;

import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.compileErrorException.CompileErrorException;

public class NoConstructorInMainClass extends CompileErrorException {

    public NoConstructorInMainClass(ClassDeclaration mainClassDeclaration) {
        super(mainClassDeclaration.getLine(), "Class Main does't have a constructor");
    }

}
