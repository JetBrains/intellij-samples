package com.jetbrains.debugging.kotlin

class ShowKotlinProperties {
    val lazyInt: Int by lazy { 10 }
    var ambiguousInt: Int = 10
        get() = 20
        set(value) {
            field = value
        }
}

fun main() {
    val instance = ShowKotlinProperties()
    println("Set the breakpoint here")
}