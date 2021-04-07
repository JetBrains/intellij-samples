package com.jetbrains.analysis;

/** @noinspection unused*/
public class DataFlow {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void modifyId() {
        id = 20;
    }

    int readId() {
        return id;
    }
}
