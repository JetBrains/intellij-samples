package com.jetbrains.code;

// if you want to change a property name you should use refactoring
record Record(int id, String name) {
    Record(int id, String name) { // non-public constructors supported
        this.id = id;
        this.name = name;
    }

    private void validateMyFields(int id, String name) {

    }

    @Override // support added in Java 15
    public String name() {
        return name;
    }
}

// generate getter does the right thing with the name
// there is no generate setter

