package com.jetbrains.tools;

/*
 * This can be run in the IntelliJ IDEA terminal (Alt+F12) with the command:
 * mvn exec:java -Dexec.mainClass="com.jetbrains.tools.Terminal"
 * Make sure the system's JAVA_HOME points to a version that can run this project (currently JDK 15).
 */
public class Terminal {
    public static void main(String[] args) {
        System.out.println("https://localhost:8080");
        throw new RuntimeException("There was some sort of problem here");
    }
}
