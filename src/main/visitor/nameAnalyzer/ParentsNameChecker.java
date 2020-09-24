package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.compileErrorException.nameErrors.FieldRedefinitionException;
import main.compileErrorException.nameErrors.MethodRedefinitionException;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.MethodSymbolTableItem;
import main.symbolTable.items.varItems.FieldSymbolTableItem;
import main.visitor.Visitor;

public class ParentsNameChecker extends Visitor<Void> {
    private String currentClassName;

    @Override
    public Void visit(Program program) {
        for(ClassDeclaration classDeclaration : program.getClasses()) {
            this.currentClassName = classDeclaration.getClassName().getName();
            classDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        for(FieldDeclaration fieldDeclaration : classDeclaration.getFields()) {
            fieldDeclaration.accept(this);
        }
        if(classDeclaration.getConstructor() != null) {
            classDeclaration.getConstructor().accept(this);
        }
        for(MethodDeclaration methodDeclaration : classDeclaration.getMethods()) {
            methodDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        this.visit((MethodDeclaration) constructorDeclaration);
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        if(!methodDeclaration.hasError()) {
            try {
                ClassSymbolTableItem classSymbolTableItem = (ClassSymbolTableItem)
                        SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + this.currentClassName, true);
                SymbolTable classSymbolTable = classSymbolTableItem.getClassSymbolTable();
                classSymbolTable.getItem(MethodSymbolTableItem.START_KEY + methodDeclaration.getMethodName().getName(), false);
                MethodRedefinitionException exception = new MethodRedefinitionException(methodDeclaration);
                methodDeclaration.addError(exception);
            } catch (ItemNotFoundException ignored) {
            }
        }
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        if(!fieldDeclaration.hasError()) {
            try {
                ClassSymbolTableItem classSymbolTableItem = (ClassSymbolTableItem)
                        SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + this.currentClassName, true);
                SymbolTable classSymbolTable = classSymbolTableItem.getClassSymbolTable();
                classSymbolTable.getItem(FieldSymbolTableItem.START_KEY + fieldDeclaration.getVarDeclaration().getVarName().getName(), false);
                FieldRedefinitionException exception = new FieldRedefinitionException(fieldDeclaration);
                fieldDeclaration.addError(exception);
            } catch (ItemNotFoundException ignored) {
            }
        }
        return null;
    }

}
