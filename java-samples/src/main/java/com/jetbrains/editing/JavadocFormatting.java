package com.jetbrains.editing;

import com.jetbrains.code.jdk17.ChildClass;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class JavadocFormatting {

    /**
     * <li>This is a JavaDoc comment</li>
     * <li>Which we can render nicely</li>
     * <li>Use Ctrl+Option+Q on macOS</li>
     * <li>Use Ctrl+Alt+Q on Windows</li>
     * <li>Or click the icon in the gutter</li>
     * <li>Right-click to change the font size</li>
     * <li>Use `Render documentation comments` setting</li>
     * <li>HTML Tags are also supported</li>
     */
    private static void toggleRenderedView(){
        System.out.println("Ctrl+Option+Q (macOS) or Ctrl+Alt+Q (Windows)");
    }

    private static void popupQuickDocumentation() {
        // press (**F1** | **Ctrl+Q**) on methods or classes
        // to pop up the javadoc documentation on the method
        toggleRenderedView();
        var childClass = new ChildClass();
        var strings = new ArrayList<String>();
    }
}
