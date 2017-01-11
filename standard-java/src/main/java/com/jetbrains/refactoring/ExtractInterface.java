package com.jetbrains.refactoring;


public class ExtractInterface {
    public class Alpha{}
    public class Bravo{}
    public class Charlie{}
    public class Delta{}

    public Bravo alphaBravo(Alpha a) {
        return new Bravo();
    }

    public Delta charlieDelta(Charlie c) {
        return new Delta();
    }

    public class Echo {
        public Bravo alphaBravo(Alpha a) {
            return new Bravo();
        }

        public Delta charlieDelta(Charlie c) {
            return new Delta();
        }
    }
}
