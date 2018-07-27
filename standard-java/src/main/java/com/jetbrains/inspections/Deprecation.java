package com.jetbrains.inspections;

@SuppressWarnings("unused")
public class Deprecation {

    private void deprecationWarnings() {
        Thread.currentThread().stop();

        Thread.currentThread().countStackFrames();

        final MyClass myClass = new MyClass();
        myClass.deprecatedMethod();
    }

    private class MyClass {
        /**
         * @deprecated use {@link MyClass#replacementMethod()} instead.
         */
        @Deprecated
        void deprecatedMethod() {

        }

        void replacementMethod() {

        }
    }
}
