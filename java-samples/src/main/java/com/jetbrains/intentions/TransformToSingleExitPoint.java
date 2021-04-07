package com.jetbrains.intentions;

@SuppressWarnings("unused")
public class TransformToSingleExitPoint {
    public int methodWithMultipleReturnPoints(String someValue) {
        if (someValue.equals("First option")) {
            return 1;
        } else if (someValue.equals("Second option")) {
            return 2;
        } else {
            return 0;
        }
    }
}
