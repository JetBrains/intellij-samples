package com.jetbrains.editing;

import com.jetbrains.code.jdk17.ChildClass;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class JavadocFormatting {

    /**
     * <li>Code demos are easier with in-editor docs rendering including HTML tags</li>
     * <li>Describe your code using headings or lists</li>
     * <li>Use ⌃⌥Q (macOS), or Ctrl+Alt+Q (Windows/Linux)</li>
     * <li>Or click the icon in the gutter area</li>
     * <li>Right-click to change the font size</li>
     * <li>You can also add remote or local images</li>
     * <img src="https://resources.jetbrains.com/storage/products/intellij-idea/img/meta/intellij-idea_1280x800.png"></img>
     * <img src="jb_beam.png"></img>
     */

    private static void toggleRenderedView(){
        System.out.println("⌃⌥Q (macOS) or Ctrl+Alt+Q (Windows/Linux)");
    }

    // Use F1 (macOS), Ctrl+Q (Windows/Linux) to access quick documentation
    // Use /⌥ (macOS), Ctrl+Shift+I (Windows/Linux) to access quick definition
    // Use ⌘B (macOS), Ctrl+B (Windows/Linux) to navigate to declaration

    private static void popupQuickDocumentation() {
        toggleRenderedView();
        var childClass = new ChildClass();
        var strings = new ArrayList<String>();
    }
}
