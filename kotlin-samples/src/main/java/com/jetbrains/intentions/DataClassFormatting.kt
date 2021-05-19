package com.jetbrains.intentions

// Long parameter lists are easier to read with each parameter written
// on a separate line. We transform the code to do that automatically

// Alt+Enter at the end of the line -> put parameter on separate lines
data class Person2(val firstName: String, val lastName: String, val age: Int, val email: String?)


// Vice-versa, if it seems that writing each parameter on a separate line
// is an overkill, we can put all the parameters to a single line, no problem

// Alt+Enter after ( -> put parameters in one line
data class Person(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val email: String?,
)


// In Kotlin, there's support for named parameters. The next intention adds those names automatically

//Alt+Enter before firstName -> Add names to call arguments. This will convert the whole statement to use named arguments
//Alt+Enter before age -> Add names to this argument... This will add the named arguments starting from this specific argument position
//Alt+Enter anywhere in the parameters list -> Put arguments on separate lines.
val p: Person = Person("Anton", "Arhipov", 16, "anton@blah.io")
