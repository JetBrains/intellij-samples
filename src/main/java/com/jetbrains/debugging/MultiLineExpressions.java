package com.jetbrains.debugging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hadihariri on 10/09/16.
 */
public class MultiLineExpressions {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList(("I do not know where family doctors acquired illegibly perplexing handwriting; " +
                "nevertheless, extraordinary pharmaceutical intellectuality counterbalancing indecipherability " +
                "transcendentalizes intercommunication's incomprehensibleness").split(" ")));
        ArrayList<String> shorter = words.stream().filter(s -> s.length() < 13).toArray();



    }
}
