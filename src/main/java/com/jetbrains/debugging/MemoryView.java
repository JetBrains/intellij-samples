package com.jetbrains.debugging;

import com.jetbrains.persistence.models.Customer;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.String.format;

public class MemoryView {

    public static void main(String[] args) {
        new MemoryView().addLoadsOfThingsToLists();
    }

    public void addLoadsOfThingsToLists() {
        String message = "I do not know where family doctors acquired illegibly perplexing handwriting";

        String[] words = message.split(" ");


        String containingL = Stream.of(words)
                                   .distinct()
                                   .map(String::toLowerCase)
                                   .filter(word -> word.contains("l"))
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
