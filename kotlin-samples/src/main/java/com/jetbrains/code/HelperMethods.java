package com.jetbrains.code;

import java.util.List;

/**
 * Called by Feature (Kotlin) to demo Java/Kotlin interop features.
 */
@SuppressWarnings("unused")
public class HelperMethods {
    public static void printAll(List<String> strings) {
        for (String string : strings) {
            System.out.println("string = " + string);
        }
    }
}
