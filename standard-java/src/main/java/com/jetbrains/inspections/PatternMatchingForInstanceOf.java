package com.jetbrains.inspections;

import com.jetbrains.inspections.entities.Employee;
import com.jetbrains.inspections.entities.Person;

@SuppressWarnings("unused")
public class PatternMatchingForInstanceOf {

    // Remember you can run these sorts of inspections over your whole application code
    private void workFromHome(Person person) {
        if (person instanceof Employee) {
            Employee employee = (Employee) person;
            if (employee.isBasedInOffice()) {
                employee.workFromHome();
            }
        }
    }
}
