package main.compileErrorException.typeErrors;

import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.compileErrorException.CompileErrorException;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.items.ClassSymbolTableItem;

public class DuplicateListId extends CompileErrorException {

    public DuplicateListId(int line) {
        super(line, "List elements cannot have the same id");
    }

}
