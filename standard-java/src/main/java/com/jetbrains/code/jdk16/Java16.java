package com.jetbrains.code.jdk16;

public class Java16 {
    void shouldWarnForWrapperConstructors() {
        // these were deprecated in Java 9, but now for JDK 16 marked for removal JEP 390
        Double aDouble = new Double(1);
    }
}
