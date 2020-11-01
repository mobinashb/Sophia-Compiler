package main.compileErrorException.nameErrors;

import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.compileErrorException.CompileErrorException;

public class MethodNameConflictWithField extends CompileErrorException {

    public MethodNameConflictWithField(MethodDeclaration methodDeclaration) {
        super(methodDeclaration.getLine(), "Method " + methodDeclaration.getMethodName().getName() + "'s name conflicts with a field's name");
    }

}
