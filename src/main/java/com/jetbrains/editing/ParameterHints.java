package com.jetbrains.editing;

import com.jetbrains.persistence.models.Customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

@SuppressWarnings({"unused", "ResultOfMethodCallIgnored"})
public class ParameterHints {
    private ParameterHints() {
    }

    private List<String> findTenLongestStrings(List<String> strings) {
        return strings.stream()
                      .sorted(Comparator.comparing(String::length).reversed())
                      .limit(10)
                      .collect(toList());
    }

    private String[] getWordsInSentence(String sentence) {
        return sentence.split("\\s");
    }


    public void startUserService() {
        new Service("/users/", 8080);
    }


    public Customer findCustomerByName(String name) {
        return findCustomer(name, null, null, 0, true);
    }

    public void noParamNames() {
        IntStream.range(10, 100);
        IntStream.of(1);

    }

    public void shortParameterNames() {
        throw new IllegalArgumentException("This is wrong!");
    }


    public Customer findCustomer(String name, String address, Integer orderNumber, int id, boolean ascending) {
        return null;
    }


    private static class Service implements Runnable {
        public Service(String path, int port) {
        }

        public void run() {

        }
    }
}
