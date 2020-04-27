package com.jetbrains.code;

// if you want to change a property name you should use refactoring
public record Record(int id, String name) {

    private void validateMyFields(int id, String name) {

    }
}

// generate getter does the right thing with the name
// there is no generate setter

