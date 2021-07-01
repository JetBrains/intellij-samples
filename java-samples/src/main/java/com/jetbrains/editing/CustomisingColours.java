package com.jetbrains.editing;

import static java.lang.Math.PI;

@SuppressWarnings("unused")
public class CustomisingColours {
    private static final int FACTOR = 2;
    private int privateField = 0;
    protected int protectedField = 0;

    private void staticImportedConstantsCanLookDifferentToClassConstants() {
        // see Editor>Colors & Fonts>Java>Class Fields and see two types of constants
        double x = PI * FACTOR;
    }

    public void membersCanBeColouredAccordingToVisibility() {
        // change settings in Preferences/Settings | Editor | Color Scheme by unfolding the Visibility node.
        publicMethod();
        protectedMethod();
        protectedField++;
        packagePrivateMethod();
        privateMethod();
        privateField++;
    }


    public void publicMethod() {
    }

    protected void protectedMethod() {
    }

    void packagePrivateMethod() {
    }

    private void privateMethod() {
    }

}
