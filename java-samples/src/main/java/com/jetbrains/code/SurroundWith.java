package com.jetbrains.code;

import com.jetbrains.entity.Location;
import com.jetbrains.inspections.entities.Person;

public class SurroundWith {
    private static final Location WORKPLACE = new Location();

    public static void main(String[] args) {
        Person person = new Person();
        // select the following and press Option+Cmd+T / Ctrl+Alt+T and select try-catch.
        // It will automatically populate with the correct exception
        if (person.isEmployed()) {
            person.goTo(WORKPLACE);
        }
    }

}
