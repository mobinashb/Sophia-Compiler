package main.compileErrorException.typeErrors;

import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.compileErrorException.CompileErrorException;

public class ClassInCyclicInheritance extends CompileErrorException {

    public ClassInCyclicInheritance(ClassDeclaration classDeclaration) {
        super(classDeclaration.getLine(), "Class " + classDeclaration.getClassName().getName() + " is in a inheritance cycle");
    }

}
