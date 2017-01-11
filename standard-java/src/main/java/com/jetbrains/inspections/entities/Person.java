package com.jetbrains.inspections.entities;

import com.jetbrains.code.Location;

public class Person implements Cloneable {
    private boolean employed;
    private boolean customer;

    public String getName() {
        return "";
    }

    public boolean isEmployed() {
        return employed;
    }

    public void goTo(Location location) throws TooSickToMoveException{

    }

    public void rest() {

    }

    public boolean isCustomer() {
        return customer;
    }

    public static class TooSickToMoveException extends RuntimeException {
    }
}
