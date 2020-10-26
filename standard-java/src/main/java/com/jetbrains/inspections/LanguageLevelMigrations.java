package com.jetbrains.inspections;

@SuppressWarnings("unused")
public class LanguageLevelMigrations {

    public String replaceNullCheckWithRequiresNonNull(final String someValue) {
        if (someValue == null) {
            return "defaultValue";
        } else {
            return someValue;
        }
    }
}
