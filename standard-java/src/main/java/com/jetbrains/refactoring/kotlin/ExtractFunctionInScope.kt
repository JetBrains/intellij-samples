package com.jetbrains.refactoring.kotlin

data class Person(val firstName: String, val lastName: String, val age: Int)

//it is possible to actually show autocompletion here too!
//start with empty function, type "val f" and autocompletion should immediately suggest "firstName"
// .., and same for lastName and age
// Next, when typing "return Person(", the editor will close the brace and call basic completion (Ctrl+Space)
// Autocompletion will suggest all 3 variables at once: firtName, lastName, age
fun createPerson(): Person {
    //select the 3 lines below, and call "extract function to scope" action
    //the action gives a choice where to extract the new function
    //1) into the local scope, i.e. inside the createPerson() fontion
    //2) or into the file, as a new function
    val firstName = "Anton"
    val lastName = "Arhipov"
    val age = 16

    return Person(firstName, lastName, age)
}

//final result:
//fun createPerson(): Person {
//    fun triple(): Triple<String, String, Int> {
//        val firstName = "Anton"
//        val lastName = "Arhipov"
//        val age = 16
//        return Triple(firstName, lastName, age)
//    }
//    val (firstName, lastName, age) = triple()
//    return Person(firstName, lastName, age)
//}