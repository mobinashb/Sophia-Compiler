package main;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;

public class Sophia {
    public int foo(int a) {
        if(a == 1) {
            return 2;
        }
        else {
            return 5;
        }
    }

    public static void main(String[] args) throws IOException {
        CharStream reader = CharStreams.fromFileName(args[0]);
        SophiaCompiler sophiaCompiler = new SophiaCompiler();
        sophiaCompiler.compile(reader);
    }
}
