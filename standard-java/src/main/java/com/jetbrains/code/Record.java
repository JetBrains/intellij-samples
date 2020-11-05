package com.jetbrains.code;

// if you want to change a property name you should use refactoring
// - Generate a constructor. Note: non-public constructors supported (Java 15)
// - Generate an accessor. Note: annotations supported (Java 15)
record Record(int id, String name) {

    //<editor-fold desc="Helper methods">
    @SuppressWarnings("unused")
    private void validateMyFields(int id, String name) {
        // do validate fields
    }
    //</editor-fold>

}
// generate getter does the right thing with the name
// there is no generate setter

