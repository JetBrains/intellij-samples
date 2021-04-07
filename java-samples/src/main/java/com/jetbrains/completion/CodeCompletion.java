package com.jetbrains.completion;

@SuppressWarnings("unused")
public class CodeCompletion {
    // type 'private void methodName' and show completion without shortcuts

    private static Square createSquare() {
        return new Square();
    }

    void stringCompletionExamples(String aString) {
        // type `aString` and see what sort of completions are available
        String substring = aString.substring(2, 56);
        aString.indexOf('3');


        // 2020.3: go to Settings -> Editor -> Code Completion and check the "mark position in completion popup
        String substring1 = aString.substring(3);

    }















    private interface Shape {
        void draw();

        String getId();
    }

    private static class Square implements Shape {
        @Override
        public void draw() {

        }

        @Override
        public String getId() {
            return null;
        }
    }

    private static class Circle implements Shape {
        @Override
        public void draw() {

        }

        @Override
        public String getId() {
            return null;
        }
    }
}
