package com.jetbrains.editing;

import static java.lang.Math.PI;

@SuppressWarnings("unused")
public class CustomisingColours {
    private static final int FACTOR = 2;

    private void staticImportedConstantsCanLookDifferentToClassConstants() {
        // see Editor>Colors & Fonts>Java>Class Fields and see two types of constants
        double x = PI * FACTOR;
    }


}
