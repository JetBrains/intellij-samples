package com.jetbrains.intentions


// You can convert a string concatenation expression into a template string.
// The result is much cleaner without the '+' operator

// step 1, initial
fun transform(text: String): String {
    //Alt+Enter -> Convert concatenation to template
    return "<" + text + ">"
}

// If the method contains only a single expression we can use the
// expression body syntax. This will remove the braces {} and
// allow type inference for the return type of the method

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
