package com.jetbrains.debugging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by hadihariri on 10/09/16.
 */
public class MultiLineExpressions {

    public static void main(String[] args) {

        String message = "I do not know where family doctors acquired illegibly perplexing handwriting; " +
                "nevertheless, extraordinary pharmaceutical intellectuality counterbalancing indecipherability " +
                "transcendentalizes intercommunication's incomprehensibleness";

        String[] words = message.split(" ");


        String containingL = Stream.of(words)
                .distinct()
                .map(String::toLowerCase)
                .filter(mood -> mood.contains("l"))
                .distinct()
                .collect(Collectors.joining(","));

        System.out.println(containingL);

    }
}
