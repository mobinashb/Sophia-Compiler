package main.symbolTable.items.varItems;


import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.ast.types.Type;

public class LocalVariableSymbolTableItem extends VarSymbolTableItem {

    public LocalVariableSymbolTableItem(VarDeclaration varDeclaration) {
        this.name = varDeclaration.getVarName().getName();
        this.type = varDeclaration.getType();
    }

}
