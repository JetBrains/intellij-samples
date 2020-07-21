package com.jetbrains.inspections;

import java.util.regex.Pattern;

@SuppressWarnings("MismatchedQueryAndUpdateOfStringBuilder")
public class Inspections {

    public boolean canReplaceEqualsWithObjectEquals(MyClass myClass) {
        return myClass.equals(new MyClass());
    }

    public boolean suspiciousEqualsCallOnStringBuilder(CharSequence charSequence) {
        final StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.equals(charSequence);
    }

    public boolean suspiciousEqualsCallOnString(CharSequence charSequence) {
        return "Some String".equals(charSequence);
    }

    public void removeEmptyIfStatement(String someValue) {
        if (someValue.isEmpty()) {
            //ignore
        }
    }

    public void removeRedundantEscapeFromRegex() {
        final Pattern pattern = Pattern.compile("[\\.]");
    }

    @SuppressWarnings("ThrowablePrintedToSystemOut")
    public void addToExistingCatchBlock() {
        try {
            methodCanThrowExceptionOne();
            // uncomment line below to see this working
            // methodCanThrowExceptionTwo();
        } catch (ExceptionOne e) {
            System.out.println(e);
        }
    }

    public void canExtractCommonConditionsFromIfStatements(Event event) {
        // press Alt Enter on firstCondition -> extract if first...
        if (firstCondition(event) && event.getType() == 3) {
            //do something
        } else if (firstCondition(event) && event.getType() == 4) {
            //do something else
        } else if (firstCondition(event) && event.getType() == 5) {
            //do another thing
        }
    }

    public boolean canSimplifyIfElse() {
        boolean enable;
        if (booleanExpression()) {
            enable = true;
        } else {
            enable = anotherBooleanExpression();
        }
        return enable;
    }


    //<editor-fold desc="Helper methods and classes">
    private void methodCanThrowExceptionTwo() throws ExceptionTwo {
        throw new ExceptionTwo();
    }

    private void methodCanThrowExceptionOne() throws ExceptionOne {
        throw new ExceptionOne();
    }

    private boolean firstCondition(Event event) {
        return true;
    }

    private boolean anotherBooleanExpression() {
        return false;
    }

    private boolean booleanExpression() {
        return false;
    }

    private class ExceptionOne extends Exception {

    }

    private class ExceptionTwo extends Exception {

    }

    private final class MyClass {
    }

    private class Event {
        private int type;

        int getType() {
            return type;
        }
    }
    //</editor-fold>
}
