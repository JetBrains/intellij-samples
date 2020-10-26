package com.jetbrains.inspections;

import com.jetbrains.inspections.entities.Person;

import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

// var (Local Variable Type Inference) was introduced in Java 10
// var can be automatically applied across the codebase, but should be done on a case-by-case basis
@SuppressWarnings("unused")
public class VarLVTI {
    /* Examples of best practice, as per http://openjdk.java.net/projects/amber/LVTIstyle.html */
    private void considerVarWhenInitializerProvidesSufficientInformationToReader() throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedReader reader = Files.newBufferedReader(Paths.get("/"));

        ByteArrayOutputStream stuff = doTheThing();
    }

    private void takeCareWhenUsingVarWithDiamondOrGenericMethods() {
        List<String> safeList = List.of("One");
        List<String> unsafeList = List.of();

        ArrayList<String> intelliJIDEAMovesTheTypeToTheRight = new ArrayList<>();
    }

    private Optional<String> varCanBreakUpChainedOrNestedExpressionsWithLocalVariables(List<String> strings) {
        return strings.stream()
                      .collect(groupingBy(s -> s, counting()))
                      .entrySet()
                      .stream()
                      .max(Map.Entry.comparingByValue())
                      .map(Map.Entry::getKey);
    }

    // Developer knowledge required
    private void chooseVariableNamesThatProvideUsefulInformation() {
        List<Person> tmp = getEveryone();

        System.out.println(tmp);
    }

    // Developer knowledge required
    private void minimizeTheScopeOfLocalVariables() {
        // imagine if someone changed the type of this from ArrayList to HashSet, it would be hard to see the
        // implication if the use of the code is much further away
        ArrayList<Person> list = new ArrayList<Person>();

        list.add(new Person("First"));
        list.add(new Person("Second"));

        /* There could be a lot of code between the declaration and the use of this variable*/

        for (Person person : list) {
            System.out.println(person);
        }
    }

    /* End of best practice examples */

    void varCanSimplifyGenericTypes(Map<? extends String, ? extends Number> map, int max) {
        for (Iterator<? extends Map.Entry<? extends String, ? extends Number>> iterator = map.entrySet()
                                                                                             .iterator();
             iterator.hasNext(); ) {
            Map.Entry<? extends String, ? extends Number> entry = iterator.next();
            if (max > 0 && matches(entry)) {
                iterator.remove();
                max--;
            }
        }
    }

    private String varCanSimplifyTryWithResources(Socket socket, String charsetName) throws IOException {
        try (InputStream is = socket.getInputStream();
             InputStreamReader isr = new InputStreamReader(is, charsetName);
             BufferedReader buf = new BufferedReader(isr)) {
            return buf.readLine();
        }
    }

    //<editor-fold desc="Helper methods">
    private List<Person> getEveryone() {
        return List.of();
    }

    private ByteArrayOutputStream doTheThing() {
        return new ByteArrayOutputStream();
    }

    private boolean matches(Map.Entry<? extends String, ? extends Number> entry) {
        return false;
    }
    //</editor-fold>

}
