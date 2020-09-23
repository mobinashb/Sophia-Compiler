package main.symbolTable.items.varItems;

import main.ast.nodes.declaration.variableDec.VarDeclaration;

public class MethodArgSymbolTableItem extends VarSymbolTableItem {

    public MethodArgSymbolTableItem(VarDeclaration varDeclaration) {
        this.name = varDeclaration.getVarName().getName();
        this.type = varDeclaration.getType();
    }

}