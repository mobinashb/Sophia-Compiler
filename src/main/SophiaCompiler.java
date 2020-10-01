package main;

import main.ast.nodes.Program;
import main.visitor.codeGenerator.CodeGenerator;
import main.visitor.nameAnalyzer.NameAnalyzer;
import main.visitor.typeChecker.TypeChecker;
import main.visitor.utils.ASTTreePrinter;
import main.visitor.utils.ErrorReporter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parsers.SophiaLexer;
import parsers.SophiaParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class SophiaCompiler {
    public void compile(CharStream textStream) {
        System.out.println("\n--------------------------Compiling--------------------------");
        SophiaLexer sophiaLexer = new SophiaLexer(textStream);
        CommonTokenStream tokenStream = new CommonTokenStream(sophiaLexer);
        SophiaParser sophiaParser = new SophiaParser(tokenStream);
        Program program = sophiaParser.sophia().sophiaProgram;
        ErrorReporter errorReporter = new ErrorReporter();
        NameAnalyzer nameAnalyzer = new NameAnalyzer(program);
        nameAnalyzer.analyze();
        int numberOfErrors = program.accept(errorReporter);
        if(numberOfErrors > 0) {
            System.out.println("\n" + numberOfErrors + " errors detected");
            System.exit(1);
        }
//        ASTTreePrinter astTreePrinter = new ASTTreePrinter();
//        program.accept(astTreePrinter);
        TypeChecker typeChecker = new TypeChecker(nameAnalyzer.getClassHierarchy());
        program.accept(typeChecker);
        numberOfErrors = program.accept(errorReporter);
        if(numberOfErrors > 0) {
            System.out.println("\n" + numberOfErrors + " errors detected");
            System.exit(1);
        }
        CodeGenerator codeGenerator = new CodeGenerator(nameAnalyzer.getClassHierarchy());
        program.accept(codeGenerator);
        System.out.println("Compilation Successful");
        runJasminFiles();
    }

    private void runJasminFiles() {
        try {
            System.out.println("\n-------------------Generating Class Files-------------------");
            File dir = new File("./output");
            Process process = Runtime.getRuntime().exec("java -jar jasmin.jar *.j", null, dir);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
            System.out.println("\n---------------------------Output---------------------------");
            process = Runtime.getRuntime().exec("java Main", null, dir);
            reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
