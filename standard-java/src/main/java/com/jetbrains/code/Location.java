package com.jetbrains.code;

import com.jetbrains.inspections.entities.Person;

import java.util.List;

public class Location {
    private List<Person> everyone;

    public List<Person> getAllPresent() {
        return everyone;
    }
}
