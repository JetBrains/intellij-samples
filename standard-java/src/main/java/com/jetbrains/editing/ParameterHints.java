package com.jetbrains.editing;

import com.jetbrains.persistence.models.Customer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

@SuppressWarnings({"unused", "ResultOfMethodCallIgnored", "SameParameterValue"})
public class ParameterHints {
    private ParameterHints() {
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
        Service.generateServiceName("user");
    }


    private Customer findCustomer(String name, String address, Integer orderNumber, int id, boolean ascending) {
        return null;
    }

    private static class Service implements Runnable {
        public Service(String path, int port) {
        }

        public void run() {

        }

        static String generateServiceName(String n) {
            return null;
        }
    }
}
