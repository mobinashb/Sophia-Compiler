package main;

import main.ast.nodes.Program;
import main.visitor.nameAnalyzer.NameAnalyzer;
import main.visitor.typeChecker.TypeChecker;
import main.visitor.utils.ASTTreePrinter;
import main.visitor.utils.ErrorReporter;
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

        ErrorReporter errorReporter = new ErrorReporter();
//        ASTTreePrinter astTreePrinter = new ASTTreePrinter();
        NameAnalyzer nameAnalyzer = new NameAnalyzer(program);
        TypeChecker typeChecker = new TypeChecker();

        nameAnalyzer.analyze();
        int numberOfErrors = program.accept(errorReporter);
        if(numberOfErrors > 0) {
            System.out.println("\n" + numberOfErrors + " errors detected");
            System.exit(1);
        }
//        program.accept(astTreePrinter);
        program.accept(typeChecker);
        numberOfErrors = program.accept(errorReporter);
        if(numberOfErrors > 0) {
            System.out.println("\n" + numberOfErrors + " errors detected");
            System.exit(1);
        }
    }
}
