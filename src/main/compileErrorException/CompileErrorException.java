package main.compileErrorException;

public class CompileErrorException extends Exception {
    private int line;
    private String message;

    public CompileErrorException() {
    }

    public CompileErrorException(int line_, String message_) {
        this.line = line_;
        this.message = message_;
    }

    public String getMessage() {
        return "Line:" + line + ":" + message;
    }
}
