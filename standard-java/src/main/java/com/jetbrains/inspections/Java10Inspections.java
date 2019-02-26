package com.jetbrains.inspections;

import com.jetbrains.inspections.entities.Person;

import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

@SuppressWarnings({"unused", "MismatchedQueryAndUpdateOfCollection", "UnnecessaryLocalVariable"})
public class Java10Inspections {

    private final Person person = new Person();

    private List<Person> varOnlyAppliesToLocalVariables(Person person) {
        final List<Person> people = List.of(person);
        return people;
    }

    private void suggestionProvidedIfTypesMatch() {
        ArrayList<Person> people = new ArrayList<Person>();
    }

    private void suggestionNotProvidedIfInterfaceUsed() {
        List<Person> people = new ArrayList<Person>();
    }

    private void suggestionProvidedIfDiamondUsedAndTypeMovedToRight() {
        ArrayList<Person> people = new ArrayList<>();
    }

    /* Examples of best practice, as per http://openjdk.java.net/projects/amber/LVTIstyle.html */
    private void chooseVariableNamesThatProvideUsefulInformation() {
        List<Person> tmp = getEveryone();

        System.out.println(tmp);
    }

    private void minimizeTheScopeOfLocalVariables() {
        ArrayList<Person> list = new ArrayList<Person>();

        list.add(new Person("First"));
        list.add(new Person("Second"));

        /* There could be a lot of code between the declaration and the use of this variable*/

        for (Person person : list) {
            System.out.println(person);
        }

    }

    private void considerVarWhenInitializerProvidesSufficientInformationToReader() throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedReader reader = Files.newBufferedReader(Paths.get("/"));

        ByteArrayOutputStream stuff = doTheThing();
    }

    private void takeCareWhenUsingVarWithDiamondOrGenericMethods() {
        List<String> safeList = List.of("One");
        List<String> unsafeList = List.of();
        ArrayList<String> safeArrayList = new ArrayList<String>();
        ArrayList<String> unsafeArrayList = new ArrayList<>();
    }

    private Optional<String> useVarToBreakUpChainedOrNestedExpressionsWithLocalVariables(List<String> strings) {
        return strings.stream()
                      .collect(groupingBy(s -> s, counting()))
                      .entrySet()
                      .stream()
                      .max(Map.Entry.comparingByValue())
                      .map(Map.Entry::getKey);
    }

    void removeMatches(Map<? extends String, ? extends Number> map, int max) {
        for (Iterator<? extends Map.Entry<? extends String, ? extends Number>> iterator = map.entrySet()
                                                                                             .iterator(); iterator.hasNext(); ) {
            Map.Entry<? extends String, ? extends Number> entry = iterator.next();
            if (max > 0 && matches(entry)) {
                iterator.remove();
                max--;
            }
        }
    }

    private String exampleTryWithResources(Socket socket, String charsetName) throws IOException {
        try (InputStream is = socket.getInputStream();
             InputStreamReader isr = new InputStreamReader(is, charsetName);
             BufferedReader buf = new BufferedReader(isr)) {
            return buf.readLine();
        }
    }

    void shouldNotWarnThatInitializerIsRedundant(boolean b) {
        var x = 0; // 2018.1 warns that initializer is redundant
        if (b) {
            x = 5;
        } else {
            x = 6;
        }
        System.out.println(x);
    }

    public void shouldNotSuggestRemovingArrayType() {
        var x = new Integer[]{2, 4, 8};
    }

    //<editor-fold desc="Helper methods">
    private boolean matches(Map.Entry<? extends String, ? extends Number> entry) {
        return false;
    }

    private ByteArrayOutputStream doTheThing() {
        return new ByteArrayOutputStream();
    }

    private List<Person> getEveryone() {
        return List.of();
    }
    //</editor-fold>

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

    //??
    List<String> doesNotSuggestUsingCollectorsToUnmodifiableListIfContainsNulls(List<Integer> input) {
        List<String> list = new ArrayList<>();
        for (Integer integer : input) {
            if (integer != null) {
                list.add(integer.toString());
            } else {
                list.add(null);
            }
        }
        return Collections.unmodifiableList(list);
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
