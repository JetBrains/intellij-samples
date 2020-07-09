package com.jetbrains.refactoring;


@SuppressWarnings({"unused", "UnusedReturnValue"})
public class ExtractInterface {
    public static class Alpha{}
    public static class Bravo{}
    public static class Charlie{}
    public static class Delta{}

    public Bravo alphaBravo(Alpha a) {
        return new Bravo();
    }

    public Delta charlieDelta(Charlie c) {
        return new Delta();
    }

    public static class Echo {
        public Bravo alphaBravo(Alpha a) {
            return new Bravo();
        }

        public Delta charlieDelta(Charlie c) {
            return new Delta();
        }
    }
}
