package com.jetbrains.inspections;

import org.jetbrains.annotations.NotNull;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.*;

@SuppressWarnings({"unused", "StatementWithEmptyBody"})
public class Inspections20182 {
    private static final int BIG_BUTTON_WIDTH = 10;
    private static final int BUTTON_HEIGHT = 3;
    private static final int[] BUTTON_Y = {5, 6, 7};

    private boolean moreBooleanExpressionsCanBeSimplified(boolean a, boolean b) {
        if (a && b) {
            return true;
        } else {
            return a;
        }
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

    private void warnsAboutComparingOptionalToNull() {
        final Optional<String> optional = getSomeOptionalValue();
        if (optional != null) {
            //do something
        }
    }

    private void suggestsStringAppendForStringJoiner() {
        String s = new StringJoiner("")
                .add("a")
                .add("b")
                .toString();
    }

    //private helper methods to make examples clearer

    private Optional<String> getSomeOptionalValue() {
        return Optional.empty();
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

    @NotNull
    private String getString() {
        return "";
    }

    interface Foo {
        int getValue();
    }

    interface Bar {
        int getValue();
    }

    //remove the T from A to see this working
    class A<T> extends B<T> {

    }

    //private classes for examples

    private class Event {
        private int type;

        int getType() {
            return type;
        }
    }

    private class B<T> {
    }

    class AnotherClass {
        void transform(Number arg) {
        }
    }
}
