package com.jetbrains.inspections.entities;

public class Converter {
    public static final Converter IDENTITY_CONVERTER = new Converter();

    public boolean canHandle(Class aClass) {
        return false;
    }
}
