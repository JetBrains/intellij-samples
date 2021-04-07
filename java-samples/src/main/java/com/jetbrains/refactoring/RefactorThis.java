package com.jetbrains.refactoring;

import java.util.List;

public class RefactorThis {
    void extractMethodFromThis(List<String> list) {
        // extract this into a method
        for (String stringVal : list) {
            System.out.println(stringVal + ", ");
        }

    }
}
