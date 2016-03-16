package com.jetbrains.inspections;


import javax.annotation.concurrent.GuardedBy;
import java.util.HashSet;
import java.util.Set;

public class ConcurrencyInspections {
    @GuardedBy("this")
    private final Set<String> _foo = new HashSet<>();

    public synchronized Set<String> getFoo() {
        return _foo;
    }

    @Override
    public String toString() {
        return "_foo=" + _foo;
    }
}
