package com.jetbrains.integration;

@SuppressWarnings("unused")
public record Actor(int id, String firstName, String lastName) {
    private static final String SQL = "SELECT * from sakila.actor where actor_id = %d";

}
