package com.jetbrains.inspections;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.regex.Pattern;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

@SuppressWarnings({"MismatchedQueryAndUpdateOfStringBuilder", "unused"})
public class Inspections {

    public boolean canReplaceEqualsWithObjectEquals(MyClass myClass) {
        return myClass.equals(new MyClass());
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

    public void canReplaceStaticImportWithQualifiers() {
        System.out.println(MAX_VALUE);
        System.out.println(MIN_VALUE);
    }

    private void suggestsAvoidingCompareToForPrimitives(Foo foo, Bar bar) {
        if (Integer.compare(foo.getValue(), bar.getValue()) == 0) {
            //do something here
        }
    }

    private void suggestsLocalVariableTypeCanBeMoreSpecific() {
        Object obj = getString();
        System.out.println(((String) obj).trim());
    }

    private void suggestsChangingTheFieldOrVariableType(final AnotherClass target) {
        String stringValue = "";
        //uncomment to see suggestions
//        target.transform(stringValue);
    }

    private Event getEvent(Class<? extends Event> eventClass) throws Exception {
        Event event;
        try {
            event = eventClass.getConstructor().newInstance();
        } catch (Exception e) {
            throw new Exception("The argument event class"
                                + eventClass.getClass()
                                            .getName() // will always print java.lang.Class, not actual event class
                                + " could not be instantiated with a default constructor",
                                e);
        }
        return event;
    }

    //remove the quotes from theValue to see this in action
    @MyAnnotation(value = "theValue")
    private void wrapAsString() {
    }

    private Integer showsRedundantGenericParams() {
        return Integer.<String>getInteger("p");
    }

    //requires "Implicit usage of platform's default charset" inspection (not enabled by default)
    private void suggestsUtF8CharsetWhenUsingPlatformDefaultCharset(OutputStream os) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(os);
    }

    private String canIntroduceLocalVariableForReturnExpression(List<String> params) {
        return params.get(1);
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

    private String getString() {
        return "";
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
    class AnotherClass {
        void transform(Number arg) {
        }
    }

    interface Foo {
        int getValue();
    }

    interface Bar {
        int getValue();
    }
    //</editor-fold>
}
