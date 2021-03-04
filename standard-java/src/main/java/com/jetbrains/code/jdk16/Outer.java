package com.jetbrains.code.jdk16;

public class Outer {
    class Inner { //non-static
        void InstanceMethod() {
            System.out.println(Outer.this);
        }

        // now static methods inside inner classes are allowed!
        // this won't work on JDK 15 or lower
        static void staticMethod() {
            // Outer.this is not accessible here
        }

        // now static classes inside inner classes are allowed
        static class StaticInnerClass {
        }
    }

    public static void main(String[] args) {
        new Runnable() {
            @Override
            public void run() {

            }

            // now static methods inside anonymous inner classes
            static void staticMethod() {

            }
        };
    }

}
