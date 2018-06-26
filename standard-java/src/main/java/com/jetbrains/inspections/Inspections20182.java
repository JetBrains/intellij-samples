package com.jetbrains.inspections;

import java.util.List;

import static java.lang.Math.PI;

@SuppressWarnings("unused")
public class Inspections20182 {
    private static final int FACTOR = 2;

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


    private void methodCanThrowExceptionTwo() throws ExceptionTwo {
        throw new ExceptionTwo();
    }

    private void methodCanThrowExceptionOne() throws ExceptionOne {
        throw new ExceptionOne();
    }

    private class ExceptionOne extends Exception {
    }

    private class ExceptionTwo extends Exception {
    }
}
