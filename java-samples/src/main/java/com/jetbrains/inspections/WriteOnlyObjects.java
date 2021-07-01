package com.jetbrains.inspections;

import java.util.concurrent.atomic.AtomicInteger;

@SuppressWarnings("unused")
public class WriteOnlyObjects {
    public void warningOnObjectsThatAreOnlyWritten() {
        AtomicInteger atomicInteger = new AtomicInteger(7);
        atomicInteger.set(1);
    }
}
