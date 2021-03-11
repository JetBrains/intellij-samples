package com.jetbrains.code.jdk16;

/**
 * <p>Static methods and classes are now allowed on inner classes, and anonymous inner classes, since #JDK16.</p>
 *
 * <ul>
 *     <li>#StandardFeature #JDK16</li>
 * </ul>
 */
@SuppressWarnings("unused")
public class StaticOnInnerClasses {

    static class Outer {
        @SuppressWarnings("unused")
        class NonStaticInnerClass {
            void instanceMethod() {
                System.out.println(Outer.this);
            }

            // #JDK16: static methods on inner classes
            static void staticMethod() {
                // Outer.this is not accessible here
            }

            // #JDK16: static classes inside inner classes
            static class StaticInnerClass {
            }
        }
    }

    public static void main(String[] args) {
        new Runnable() {
            @Override
            public void run() {

            }

            // #JDK16: static methods inside anonymous inner classes
            static void staticMethod() {

            }
        };
    }

}
