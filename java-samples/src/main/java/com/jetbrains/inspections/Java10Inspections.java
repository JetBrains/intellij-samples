package com.jetbrains.inspections;

import com.jetbrains.inspections.entities.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings({"unused", "MismatchedQueryAndUpdateOfCollection", "UnnecessaryLocalVariable"})
public class Java10Inspections {

    private final Person person = new Person();

    private List<Person> varOnlyAppliesToLocalVariables(Person person) {
        final List<Person> people = List.of(person);
        return people;
    }

    // Note that we can use the diamond operator and the type is moved right
    private void suggestionProvidedIfTypesMatch() {
        ArrayList<Person> people = new ArrayList<>();
    }

    private void suggestionNotProvidedIfInterfaceUsed() {
        List<Person> people = new ArrayList<>();
    }

    //note: this can go to and from the Streams API
    List<String> suggestUsingCollectorsToUnmodifiableList(List<Integer> input) {
        List<String> list = new ArrayList<>();
        for (Integer integer : input) {
            if (integer != null) {
                String toString = integer.toString();
                list.add(toString);
            }
        }
        return Collections.unmodifiableList(list);
    }

    List<String> suggestUsingCollectorsToUnmodifiableListForStreamOperation(List<Integer> input) {
        return Collections.unmodifiableList(input.stream()
                                                 .filter(Objects::nonNull)
                                                 .map(Object::toString)
                                                 .collect(Collectors.toList()));
    }

    List<String> notAllowedToCollectNullsToUnmodifiableList(List<Integer> input) {
        return input.stream()
                    .map(integer -> integer == null ? null : integer.toString()) //not allowed nulls if collecting into unmodifiableList
                    .collect(Collectors.toUnmodifiableList());
    }

    List<String> notAllowedToAddNullsToUnmodifiableList(List<Integer> input) {
        List<String> collect = input.stream()
                                    .map(Object::toString)
                                    .collect(Collectors.toUnmodifiableList());
        collect.add("Can't add things to an unmodifiable list");
        return collect;
    }

    List<String> suggestingUsingCopyOf(Collection<String> collection) {
        return Collections.unmodifiableList(new ArrayList<>(collection));
    }


}
