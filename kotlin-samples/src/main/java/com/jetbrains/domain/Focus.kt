package com.jetbrains.domain

class Focus(wheels: Array<Wheel>) : Car {
    val make = "Ford"
    override fun drive() {
        println("I like driving in my car")
    }
}