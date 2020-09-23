package main.symbolTable.items.varItems;


import main.ast.types.Type;
import main.symbolTable.items.SymbolTableItem;

public class VarSymbolTableItem extends SymbolTableItem {
    public static String START_KEY = "VAR_";
    protected Type type;

    public String getKey() {
        return START_KEY + this.name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
