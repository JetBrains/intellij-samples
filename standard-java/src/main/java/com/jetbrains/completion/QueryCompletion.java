package com.jetbrains.completion;

import java.sql.Connection;
import java.sql.SQLException;

public class QueryCompletion {
    public void query(Connection connection) {
        try {
            //Configure data source, then edit query with schema completion
            connection.prepareCall("SELECT * FROM Employee WHERE Employee.FirstName LIKE Employee.LastName");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}