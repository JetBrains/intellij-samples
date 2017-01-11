package com.jetbrains.debugging;

import org.junit.Test;

@SuppressWarnings("ALL")
public class DebuggingTest {
    @Test
    public void shouldRenderPrimitiveTypes() {
        UnderTest underTest = new UnderTest();
        underTest.doSomething();

        System.out.println(underTest.getWords());
    }

    @Test
    public void shouldShowChangingValuesInMemoryView() {
        UnderTest underTest = new UnderTest();
        underTest.doSomething();

        IgnoreException ignoreException = new IgnoreException();

        UnderTest anotherUnderTest = new UnderTest();

        InlineDebugging inlineDebugging = new InlineDebugging();
    }

    @Test
    public void shouldTriggerAnExceptionBreakpoint() {
        UnderTest underTest = new UnderTest();
        underTest.catchesCustomException();
    }

    @Test
    public void shouldNotTriggerAnExceptionBreakpoint() {
        IgnoreException ignoreException = new IgnoreException();
        ignoreException.catchesCustomException();
    }

    @Test
    public void shouldRunUsingADifferentJVM() {
        InlineDebugging forDebugging = new InlineDebugging();
        forDebugging.run();
    }

    private class UnderTest {
        private int someValue = 2;
        private AnotherClass obj = new AnotherClass();
        private String[] words = {"This", "is", "an", "array", "of", "Strings"};
        private int[] integers = {1, 1, 2, 3, 5};

        private void doSomething() {
            someValue++;
        }

        public String[] getWords() {
            return words;
        }

        public void catchesCustomException() {
            try {
                obj.throwException();
            } catch (CustomException e) {
                e.printStackTrace();
            }
        }
    }

    private class IgnoreException {
        private AnotherClass obj = new AnotherClass();
        private void catchesCustomException() {
            try {
                obj.throwException();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private class AnotherClass {
        private String value = "The Value";
        public void throwException() {
            throw new CustomException();
        }
    }

    private class CustomException extends RuntimeException {
    }
}