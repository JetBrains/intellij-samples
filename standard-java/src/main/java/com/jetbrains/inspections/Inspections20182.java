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

    private void addToExistingCatchBlock() {
        try {
            methodCanThrowExceptionOne();
            methodCanThrowExceptionTwo();
            //delete ExceptionTwo from the line below to see this working
        } catch (ExceptionOne | ExceptionTwo e) {
            System.out.println(e);
        }
    }

    private void canReplaceRemoveWithListClear(List<String> list) {
        int from = 3;
        int to = 8;

        for (int i = from; i < to; i++) {
            list.remove(from);
        }
    }

    private void warnOnListRemoveInsideCountedLoop(List<String> someList) {
        for (int i = 0; i < 10; i++) {
            if (booleanExpression()) {
                someList.remove(i);
            }
        }
    }

    private void canUnrollDecreasingLoops() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

    private void canReplaceMapForEachWithEntrySetLoop(Map<String, Integer> map) {
        map.forEach((k, v) -> {
            if (k.isEmpty()) return;
            System.out.println("Key: " + k + "; value: " + v);
        });
    }

    private void canReplaceMapForEachWithEntrySetLoop(Map<String, Integer> map, Map<String, Integer> otherMap) {
        map.forEach(otherMap::putIfAbsent);
    }

    private <T> LinkedList<T> suggestsAtomicOperationForLinkedListFromCollection(Collection<T> collection) {
        LinkedList<T> list = new LinkedList<>();
        list.addAll(collection);
        return list;
    }

    private void canExtractCommonConditionsFromIfStatements(Event event) {
        if (firstCondition(event) && event.getType() == 3) {
            //do something
        } else if (firstCondition(event) && event.getType() == 4) {
            //do something else
        } else if (firstCondition(event) && event.getType() == 5) {
            //do another thing
        }
    }

    private boolean canSimplifyIfElse() {
        boolean enable;
        if (booleanExpression()) {
            enable = true;
        } else {
            enable = anotherBooleanExpression();
        }
        return enable;
    }

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

    private static Long suggestsUsingAPrimitiveInsteadOfWrapper(List<? extends Long> totals) {
        Long total = 0L;

        for (Long element: totals) {
            total += element == null ? 0 : element;
        }

        return total;
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

    //remove the T from A to see this working
    class A<T> extends B<T> {

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
    private void methodCanThrowExceptionTwo() throws ExceptionTwo {
        throw new ExceptionTwo();
    }

    private void methodCanThrowExceptionOne() throws ExceptionOne {
        throw new ExceptionOne();
    }

    private boolean firstCondition(Event event) {
        return true;
    }

    private Optional<String> getSomeOptionalValue() {
        return Optional.empty();
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

    //private classes for examples
    private class ExceptionOne extends Exception {
    }

    private class ExceptionTwo extends Exception {
    }

    private class Event {
        private int type;

        int getType() {
            return type;
        }
    }

    interface Foo {
        int getValue();
    }

    interface Bar {
        int getValue();
    }

    private class B<T> {
    }

    class AnotherClass {
        void transform(Number arg) {
        }
    }
}
