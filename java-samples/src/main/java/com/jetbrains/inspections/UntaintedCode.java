// Reports when a non-safe String is passed to a method marked with annotation from org.checkerframework.checker.tainting.qual.Untainted.
// If a reference is untainted, it can be trusted
// A safe String is:
// - call of a method that is annotated with @Untainted
// - local variable or method parameter that does not call non-safe methods
// - field, local variable or parameter that is marked as @Untainted and does not have non-safe methods calls assigned

// Inspection will flag if you use a String that is unknown or annotated with @Tainted in a method that's annotated as @Untainted.

package com.jetbrains.inspections;

import org.checkerframework.checker.tainting.qual.Tainted;
import org.checkerframework.checker.tainting.qual.Untainted;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UntaintedCode {

    private void getUserInput() {
        try {
            // This is a bad String to pass in
            @Tainted String sqlInjectionString = "5 OR 1=1";
            printInputString(sqlInjectionString);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // this is a 'safe' method
    public void printInputString(@Untainted String input) throws SQLException {
        Connection databaseConnection = DriverManager.getConnection("https://localhost:27017",
                                                                    "username",
                                                                    "password");
        databaseConnection.prepareCall("SELECT * FROM User WHERE id " + input);
    }
}