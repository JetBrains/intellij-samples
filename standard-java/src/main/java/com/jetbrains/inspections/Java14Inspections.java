package com.jetbrains.inspections;

import com.jetbrains.inspections.entities.Employee;
import com.jetbrains.inspections.entities.Person;

@SuppressWarnings("unused")
public class Java14Inspections {

    private void workFromHome(Person person) {
        if (person instanceof Employee) {
            Employee employee = (Employee) person;
            if (employee.isBasedInOffice()) {
                employee.workFromHome();
            }
        }
    }
}
