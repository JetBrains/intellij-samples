package com.jetbrains.completion;

@SuppressWarnings("unused")
public class CodeCompletion {
    // type private void completion and show completion without shortcuts

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
