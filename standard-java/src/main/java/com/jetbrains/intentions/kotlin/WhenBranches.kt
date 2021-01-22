package com.jetbrains.intentions.kotlin


enum class Entry {
    FOO, BAR, BAZ
}

fun test(e: Entry) {
    when (e) {
        // Alt+Enter -> Add remaining branches
    }
}

