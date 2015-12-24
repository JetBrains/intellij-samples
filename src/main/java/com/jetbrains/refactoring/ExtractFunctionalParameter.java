package com.jetbrains.refactoring;

/**
 * Created by breandan on 2/9/2015.
 */
public class ExtractFunctionalParameter {
    public static void main(String[] args) {
        doStuff();
    }

    private static void doStuff() {
        long i = 0;
        String s = "d";

        //Extract functional parameter as BiFunction (Ctrl/Cmd+Alt+Shift+P)
        Double d = stringToDouble(i + s);
    }


    @FunctionalInterface
    public interface MyFunction<A, B, C, D> {
        public D convert(A a, B b, C c);
    }

    public static double stringToDouble(String s) {
        return Double.valueOf(s);
    }

    class MyClass {
        public String getS() {
            return s;
        }

        public void setS(String s) {
            this.s = s;
        }

        String s = "";
        Integer i = 1;
    }
}
