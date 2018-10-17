package com.jetbrains.inspections;

import org.junit.Test;

import java.util.List;

import static java.util.stream.Collectors.toUnmodifiableList;

public class Java11InspectionsTest {
    @Test
    public void stringAPIChanges() {
        List<String> lines = "1\n2\n3\n4\n5".lines()
                                            .collect(toUnmodifiableList());
        System.out.println("lines = " + lines);

    }

}