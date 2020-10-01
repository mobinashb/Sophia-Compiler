package main.compileErrorException.typeErrors;

import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.compileErrorException.CompileErrorException;

public class NoConstructorInMainClass extends CompileErrorException {

    public NoConstructorInMainClass(ClassDeclaration mainClassDeclaration) {
        super(mainClassDeclaration.getLine(), "Class Main doesn't have a constructor");
    }

}
