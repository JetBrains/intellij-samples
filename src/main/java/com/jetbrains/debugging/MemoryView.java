package com.jetbrains.debugging;

import com.jetbrains.persistence.models.Customer;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.String.format;

/**
 * Created by hadihariri on 10/09/16.
 */
public class MemoryView {

    public static void main(String[] args) {

        String message = "I do not know where family doctors acquired illegibly perplexing handwriting";

        String[] words = message.split(" ");


        String containingL = Stream.of(words)
                .distinct()
                .map(String::toLowerCase)
                .filter(mood -> mood.contains("l"))
                .distinct()
                .collect(Collectors.joining(","));
        ArrayList<Customer> customers = new ArrayList<>();

        ArrayList<String> cars = new ArrayList<>();

        cars.add("Toyota");

        for (int i = 0; i < 100; i++) {
            customers.add(new Customer());
            if (i % 5 == 0) {
                cars.add(format("A New Car %d", i));
            }
        }

        cars.add("Audi");
        cars.add("Tesla");
    }
}
