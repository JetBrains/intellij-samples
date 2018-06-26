package com.jetbrains.inspections;

import java.util.*;

import static java.lang.Math.PI;

@SuppressWarnings({"unused", "StatementWithEmptyBody"})
public class Inspections20182 {
    private static final int FACTOR = 2;
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

    private void staticImportedConstantsCanLookDifferentToClassConstants() {
        // see Editor>Colors & Fonts>Java>Class Fields and see two types of constants
        double x = PI * FACTOR;
    }

    private void canReplaceRemoveWithListClear(List<String> list) {
        int from = 3;
        int to = 8;

        for (int i = from; i < to; i++) {
            list.remove(from);
        }
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

    private void suggestsStringAppendForStringJoiner() {
        String s = new StringJoiner("")
                .add("a")
                .add("b")
                .toString();
    }

    private <T> LinkedList<T> suggestsAtomicOperationForLinkedListFromCollection(Collection<T> collection) {
        LinkedList<T> list = new LinkedList<>();
        list.addAll(collection);
        return list;
    }

    private void suggestsAvoidingCompareToForPrimitives(Foo foo, Bar bar) {
        if (Integer.compare(foo.getValue(), bar.getValue()) == 0) {
            //do something here
        }
    }

    private Integer showsRedundantGenericParams() {
        return Integer.<String>getInteger("p");
    }

    private void warnsAboutComparingOptionalToNull() {
        final Optional<String> optional = getSomeOptionalValue();
        if(optional != null) {
            //do something
        }
    }

    private void canSimplifyIfElse() {
        boolean enable;
        if (booleanExpression()) {
            enable = true;
        } else {
            enable = anotherBooleanExpression();
        }
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

}