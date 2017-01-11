package com.jetbrains.inspections.entities;

import org.jetbrains.annotations.NotNull;

public class Counter implements Comparable<Counter>{
    public final static Counter EMPTY = new Counter();
    private int count;

    public void incrementCount() {

    }

    public int getCount() {
        return count;
    }

    @Override
    public int compareTo(@NotNull Counter o) {
        return count-o.count;
    }
}
