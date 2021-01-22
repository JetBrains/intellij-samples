package com.jetbrains.refactoring.kotlin

// Alt+Enter after ( -> put parameters in one line
data class Person(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val email: String?,
)

// Alt+Enter at the end of the line -> put parameter on separate lines
data class Person2(val firstName: String, val lastName: String, val age: Int, val email: String?)

//Alt+Enter before firstName -> Add names to call arguments. This will convert the whole statement to use named arguments
//Alt+Enter before age -> Add names to this argument... This will add the named arguments starting from this specific argument position
//Alt+Enter anywhere in the parameters list -> Put arguments on separate lines.
val p: Person = Person("Anton", "Arhipov", 16, "anton@blah.io")
