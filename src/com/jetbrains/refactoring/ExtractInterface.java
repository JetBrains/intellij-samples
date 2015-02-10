package com.jetbrains.refactoring;

/**
 * Created by breandan on 2/9/2015.
 */
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
