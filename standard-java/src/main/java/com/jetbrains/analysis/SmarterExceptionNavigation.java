package com.jetbrains.analysis;

public class SmarterExceptionNavigation {
    public static void main(String[] args) {
//        shouldNavigateDirectlyToTheCorrectPlaceForNullPointer();
//        shouldNavigateDirectlyToTheCorrectPlaceForClassCastException();
        shouldGiveDataflowSuggestionsForIndexOutOfBounds();
    }

    //This is supposed to error
    private static void shouldNavigateDirectlyToTheCorrectPlaceForNullPointer() {
        System.out.println(getSomethingNull().toString());
    }

    //This is supposed to error
    private static void shouldNavigateDirectlyToTheCorrectPlaceForClassCastException() {
        int value = (int) getAString();
        System.out.println("value = " + value);
    }

    //This is supposed to error
    private static void shouldGiveDataflowSuggestionsForIndexOutOfBounds() {
        int[] ints = {35, 543, 56622};

        for (int i = 0; i < ints.length; i++) {
            int index = i + 1;
            int anInt = ints[index];
            System.out.println("anInt = " + anInt);
        }

    }

    //<editor-fold desc="Helper methods">
    private static Object getSomethingNull() {
        return null;
    }

    private static Object getAString() {
        return "a string";
    }
    //</editor-fold>
}
