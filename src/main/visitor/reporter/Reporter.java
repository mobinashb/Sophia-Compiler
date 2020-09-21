package main.visitor.reporter;

import main.ast.nodes.Program;
import main.visitor.Visitor;

public class Reporter extends Visitor<Integer> {
    @Override
    public Integer visit(Program program) {
        return 0;
    }
}
