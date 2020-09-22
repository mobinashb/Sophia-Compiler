package main;

import main.ast.nodes.Program;
import main.visitor.NameAnalyser.NameAnalyzer;
import main.visitor.reporter.Reporter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parsers.SophiaLexer;
import parsers.SophiaParser;

public class SophiaCompiler {
    public void compile(CharStream textStream) {
        SophiaLexer sophiaLexer = new SophiaLexer(textStream);
        CommonTokenStream tokenStream = new CommonTokenStream(sophiaLexer);
        SophiaParser sophiaParser = new SophiaParser(tokenStream);
        Program program = sophiaParser.sophia().sophiaProgram;
        Reporter errorReporter = new Reporter();
        NameAnalyzer nameAnalyzer = new NameAnalyzer(program);
        nameAnalyzer.analyze();
        int numberOfErrors = program.accept(errorReporter);
        if(numberOfErrors > 0) {
            System.out.println(numberOfErrors + " errors detected.");
            return;
        }
        System.out.println("No errors detected.");
    }
}
