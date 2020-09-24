package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.compileErrorException.nameErrors.FieldRedefinition;
import main.compileErrorException.nameErrors.MethodNameConflictWithField;
import main.compileErrorException.nameErrors.MethodRedefinition;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.MethodSymbolTableItem;
import main.symbolTable.items.varItems.FieldSymbolTableItem;
import main.visitor.Visitor;

public class NameChecker extends Visitor<Void> {
    private String currentClassName;

    private SymbolTable getCurrentClassSymbolTable() {
        try {
            ClassSymbolTableItem classSymbolTableItem = (ClassSymbolTableItem)
                    SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + this.currentClassName, true);
            return classSymbolTableItem.getClassSymbolTable();
        } catch (ItemNotFoundException ignored) {
            return null;
        }
    }

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
                SymbolTable classSymbolTable = this.getCurrentClassSymbolTable();
                classSymbolTable.getItem(MethodSymbolTableItem.START_KEY + methodDeclaration.getMethodName().getName(), false);
                MethodRedefinition exception = new MethodRedefinition(methodDeclaration);
                methodDeclaration.addError(exception);
            } catch (ItemNotFoundException ignored) {
            }
        }
        try {
            SymbolTable classSymbolTable = this.getCurrentClassSymbolTable();
            classSymbolTable.getItem(FieldSymbolTableItem.START_KEY + methodDeclaration.getMethodName().getName(), true);
            MethodNameConflictWithField exception = new MethodNameConflictWithField(methodDeclaration);
            methodDeclaration.addError(exception);
        } catch (ItemNotFoundException ignored) {
        }
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        if(!fieldDeclaration.hasError()) {
            try {
                SymbolTable classSymbolTable = this.getCurrentClassSymbolTable();
                classSymbolTable.getItem(FieldSymbolTableItem.START_KEY + fieldDeclaration.getVarDeclaration().getVarName().getName(), false);
                FieldRedefinition exception = new FieldRedefinition(fieldDeclaration);
                fieldDeclaration.addError(exception);
            } catch (ItemNotFoundException ignored) {
            }
        }
        return null;
    }

}
