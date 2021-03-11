package com.jetbrains.intentions.kotlin

// When expression requires us to cover all the possible options for the parameter
// We can generate all the branches automatically with "Add remaining branches" action


enum class Entry {
    FOO, BAR, BAZ
}

fun test(e: Entry) {
    when (e) {
        // Alt+Enter -> Add remaining branches
    }
}

