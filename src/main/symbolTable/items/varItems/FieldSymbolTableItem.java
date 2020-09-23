package main.symbolTable.items.varItems;


import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.types.Type;

public class FieldSymbolTableItem extends VarSymbolTableItem {

    public FieldSymbolTableItem(FieldDeclaration fieldDeclaration) {
        this.name = fieldDeclaration.getVarDeclaration().getVarName().getName();
        this.type = fieldDeclaration.getVarDeclaration().getType();
    }

}
