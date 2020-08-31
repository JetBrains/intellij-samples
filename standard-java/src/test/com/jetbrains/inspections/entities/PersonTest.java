package com.jetbrains.inspections.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class PersonTest {

    @Test
    void shouldHaveSomeMethodsUsedElsewhere() {
        Person person = new Person();
        assertFalse(person.isEmployed());
    }
}