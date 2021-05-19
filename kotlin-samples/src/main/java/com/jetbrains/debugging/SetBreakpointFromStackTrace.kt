package com.jetbrains.debugging

//This is supposed to error
// when you run this you'll get an exception, with a hint to "Create breakpoint"
// this will let you set an Exception breakpoint on ArrayIndexOutOfBounds exceptions
fun main() {
    val ints = intArrayOf(35, 543, 56622)
    for (i in 1..10) {
        val anInt = ints[i]
        println("anInt = $anInt")
    }
}

