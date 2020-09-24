package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.utils.graph.Graph;
import main.symbolTable.utils.graph.exceptions.*;

public class ParentLinker {

    public Graph<String> analyze(Program program) {
        Graph<String> classHierarchy = new Graph<>();
        for (ClassDeclaration classDeclaration : program.getClasses()) {
            String className = classDeclaration.getClassName().getName();
            try {
                classHierarchy.addNode(className);
            } catch (NodeAlreadyExistsException ignored) { }
            if (classDeclaration.getParentClassName() == null)
                continue;
            String parentName = classDeclaration.getParentClassName().getName();
            try {
                classHierarchy.addNodeAsParentOf(className, parentName);
                ClassSymbolTableItem parentSTI = (ClassSymbolTableItem) SymbolTable.root
                        .getItem(ClassSymbolTableItem.START_KEY + parentName, true);
                ClassSymbolTableItem thisClassSTI = (ClassSymbolTableItem) SymbolTable.root
                        .getItem(ClassSymbolTableItem.START_KEY + className, true);
                thisClassSTI.getClassSymbolTable().pre = parentSTI.getClassSymbolTable();
            } catch (ItemNotFoundException | GraphDoesNotContainNodeException ignored) { }
        }
        return classHierarchy;
    }

}
