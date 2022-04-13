package com.jetbrains.editing;

import com.jetbrains.code.jdk17.ChildClass;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class JavadocFormatting {


    /**
     * <li>Code demos are easier with in-editor docs rendering including HTML tags</li>
     * <li>Describe your code using headings or lists</li>
     * <li>Use ⌃⌥Q (macOS), or Ctrl+Alt+Q (Windows/Linux)</li>
     * <li>Or click the gutter icon</li>
     * <li>Right-click to change the font size of rendered Javadocs</li>
     * <li>You can also add local or remote images</li>
     * <img src="https://resources.jetbrains.com/storage/products/intellij-idea/img/meta/intellij-idea_1280x800.png"></img>
     * <img src="jb_beam.png"></img>
     * <a href="https://www.jetbrains.com/">JetBrains Website</a>
     */


    private static void toggleRenderedView(){
        System.out.println("⌃⌥Q (macOS) or Ctrl+Alt+Q (Windows/Linux)");
    }

    private static void popupQuickDocumentation() {
        // press (**F1** | **Ctrl+Q**) on methods or classes
        // to pop up the javadoc documentation on the method
        toggleRenderedView();
        var childClass = new ChildClass();
        var strings = new ArrayList<String>();
    }
}
