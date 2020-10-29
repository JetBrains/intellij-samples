package com.jetbrains.debugging;

import java.util.ArrayList;

public class MarkingObject {


    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("Toyota");
        cars.add("Audi");
        cars.add("Tesla");
        iterateList(cars);
    }

    private static void iterateList(ArrayList<String> instances) {
        executeAction(instances);
    }

    private static void executeAction(ArrayList<String> instances) {
        for (String instance : instances) {
            System.out.println(instance);
        }
    }
}
