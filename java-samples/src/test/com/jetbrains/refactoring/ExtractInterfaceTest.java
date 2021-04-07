package com.jetbrains.refactoring;

import org.junit.jupiter.api.Test;

class ExtractInterfaceTest {
    @Test
    void shouldReplaceWithInterface() {
        ExtractInterface extractInterface = new ExtractInterface();

        extractInterface.alphaBravo(new ExtractInterface.Alpha());
    }
}