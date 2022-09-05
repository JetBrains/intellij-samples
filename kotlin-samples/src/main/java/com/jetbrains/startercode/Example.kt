package com.jetbrains.startercode


// Press Press ⇧⇧ (macOS) or Ctrl+Ctrl (Windows/Linux) to open the Search Everywhere dialog and type `soft wrap`, press **Enter** to enable it. Now your code will be wrapped within the IDE.
// You can also search for classes such as this one `Example.kt`, files in your project, actions in the IDE, and settings including themes or plugins in this dialog.

fun main(args: Array<String>) {
    val name = "Marit"
    // Note that IntelliJ IDEA has highlighted the variable name in the String below.
    // Use ⌥⏎ (macOS), or Alt+Enter (Windows/Linux) with your caret on the highlighted text to see what IntelliJ IDEA suggests to fix it!
    // Press Enter to accept the suggestion.
    print("Hello ${name} and welcome!")
    // Press ⌃R (macOS), or Shift+F10 (Windows/Linux) run the code or press the green arrow button in the gutter. These are known as gutter icons, try using Search Everywhere to see where you can configure them.
    // Press ⌃R (macOS), or Shift+F10 (Windows/Linux) run the code or press the green arrow button in the gutter. These are known as gutter icons, try using Search Everywhere to see where you can configure them.
    val colors = arrayOf("Red", "Green", "Blue", "Yellow")
    // Press ⌘F8 on the line below this one to add a breakpoint.
    for (c in colors) {
        println(c)
        // Press ^D (macOS), or Shift+F9 (Windows/Linux) to start debugging your code. (Learn Debug)[IFT link] with lessons interactively.
    }
}