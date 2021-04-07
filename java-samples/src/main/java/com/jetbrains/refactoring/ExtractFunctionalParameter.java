package com.jetbrains.refactoring;

@SuppressWarnings("unused")
public class ExtractFunctionalParameter {
    public static void main(String[] args) {
        convertToDouble();
    }

    private static void convertToDouble() {
        long i = 0;
        String s = "d";
        Double d = stringToDouble(i + s);
    }

    @FunctionalInterface
    public interface MyFunction<A, B, C, D> {
        public D convert(A a, B b, C c);
    }

    private static double stringToDouble(String s) {
        return Double.parseDouble(s);
    }

    static class MyClass {
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
