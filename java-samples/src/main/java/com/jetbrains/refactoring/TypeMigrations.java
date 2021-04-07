package com.jetbrains.refactoring;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class TypeMigrations {
    private ArrayList<String> myResult;

    public String[] getResult() {
        return myResult.toArray(new String[myResult.size()]);
    }
}
