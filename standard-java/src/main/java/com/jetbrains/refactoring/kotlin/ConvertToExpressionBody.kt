package com.jetbrains.refactoring.kotlin


// step 1, initial
fun transform(text: String): String {
    //Alt+Enter -> Convert concatenation to template
    return "<" + text + ">"
}

//step 2
//Alt+Enter at the opening brace { -> Convert to expression body
//fun transform(text: String): String {
//    return "<$text>"
//}

//step 3
//fun transform(text: String): String = "<$text>" // Alt+Enter on return type -> "Remove explicit type specification"

//final result
//fun transform(text: String) = "<$text>"


fun main() {
    transform("my text") // Alt+Enter in braces -> Add 'text =' to argument
}
