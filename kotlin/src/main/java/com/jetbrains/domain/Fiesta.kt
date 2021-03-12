package com.jetbrains.domain

/**
 * Hierarchy for showing in a UML diagram. Use Cmd+Option+Shift+U to generate/view the UML diagram.
 */
@Suppress("unused")
class Fiesta : Car {
    override fun drive() {
        println("Driving my little orange Ford Fiesta")
    }
}
