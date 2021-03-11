package com.jetbrains.refactoring.kotlin

@Suppress("unused", "SameParameterValue")
class ExtractParameter {

    fun callsGreetPerson() {
        greetPerson("you")
    }

    private fun greetPerson(personName: String) {
        // Extract parameter: Ctrl+Alt+P/Cmd+Option+P
        // Try different options, such as setting a default value
        val greeting = "Hello, "
        println(greeting + personName)
    }

}