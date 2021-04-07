package com.jetbrains.editing;

import java.util.ArrayList;
import java.util.List;

public class PostfixCompletion {
    public static void main(String[] args) {
        final List<String> strings = getStrings();
        // type strings.notnull
        // type strings.for

        // type strings.var
    }

    //<editor-fold desc="Helper methods">
    private static List<String> getStrings() {
        return new ArrayList<>();
    }
    //</editor-fold>
}
