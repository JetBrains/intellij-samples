package com.jetbrains.inspections;

public class Inspections20182 {
    private void addToExistingCatchBlock() {
        try {
            methodCanThrowExceptionOne();
            methodCanThrowExceptionTwo();
            //delete ExceptionTwo from the line below to see this working
        } catch (ExceptionOne | ExceptionTwo e) {
            System.out.println(e);
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
