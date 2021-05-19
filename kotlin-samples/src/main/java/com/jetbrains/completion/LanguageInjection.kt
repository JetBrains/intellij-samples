package com.jetbrains.completion

@Suppress("unused")
class LanguageInjection {
    @Suppress("ConvertToStringTemplate")
    fun getActorByName(firstName: String, lastName: String) {
        // Note that you get SQL completion and formatting even though the String is built up with concatenation
        val sql = "SELECT * from sakila.actor where first_name = " + firstName + " AND last_name = " + lastName
    }
}