package com.jetbrains.code;

import com.jetbrains.inspections.entities.Person;

public class SurroundWith {
    private static final Location WORKPLACE = new Location();

    public static void main(String[] args) {
        Person person = new Person();
        try {
            if (person.isEmployed()) {
                person.goTo(WORKPLACE);
            }
        } catch (Person.TooSickToMoveException e) {
            person.rest();
        }
    }

}
