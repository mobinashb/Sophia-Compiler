package main.compileErrorException.typeErrors;

import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.compileErrorException.CompileErrorException;

public class PathInMethodWithNoReturn extends CompileErrorException {

    public PathInMethodWithNoReturn(MethodDeclaration methodDeclaration) {
        super(methodDeclaration.getLine(), "There is not return statement in a path in method " + methodDeclaration.getMethodName().getName() + " witch it's return type is not void");
    }

}
