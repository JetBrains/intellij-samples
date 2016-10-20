package com.jetbrains.inspections.entities;

import com.jetbrains.inspections.Java8Inspections;

public class Counter {
    public final static Counter EMPTY = new Counter();
    private int count;

    public void incrementCount() {

    }

    public int getCount() {
        return count;
    }
}
