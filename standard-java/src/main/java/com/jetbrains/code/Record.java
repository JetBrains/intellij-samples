package com.jetbrains.code;

// if you want to change a property name you should use refactoring
record Record(int id, String name) {
//    Record(int id, String name) { // non-public constructors don't seem to be supported in EAP 5 or the nightly?
//        this.id = id;
//        this.name = name;
//    }

    private void validateMyFields(int id, String name) {

    }

//    @Override // doesn't seem to be supported in EAP 5 or the nightly?
//    public String name() {
//        return name;
//    }

    static interface LocalInterface {
        void someMethod();
    }

    enum MyValues {
        FIRST, SECOND
    }

}

// generate getter does the right thing with the name
// there is no generate setter

