package main.visitor.typeChecker;

public class RetConBreak {
    public boolean doesReturn;
    public boolean doesBreakContinue;

    public RetConBreak(boolean doesReturn, boolean doesBreakContinue) {
        this.doesReturn = doesReturn;
        this.doesBreakContinue = doesBreakContinue;
    }
}
