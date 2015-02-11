package com.jetbrains.debugging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by breandan on 2/9/2015.
 */
public class LambdaEvaluation {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList(("I do not know where family doctors acquired illegibly perplexing handwriting; " +
                "nevertheless, extraordinary pharmaceutical intellectuality counterbalancing indecipherability " +
                "transcendentalizes intercommunication’s incomprehensibleness").split(" ")));
        //Evaluate the following lambda in debugger: words.stream().filter(s -> s.length() < 13).toArray()
    }
}
