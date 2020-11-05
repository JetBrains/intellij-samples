package com.jetbrains.code.jdk15;

@SuppressWarnings("unused")
public class Name {
    private final String name;

    public Name(String name) {
        this.name = name;
    }

    // if your data class has getters, use rename refactoring to remove "get"
    public String name() {
        return name;
    }
}
