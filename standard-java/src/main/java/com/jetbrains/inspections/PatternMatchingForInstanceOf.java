package com.jetbrains.inspections;

import com.jetbrains.inspections.entities.Employee;
import com.jetbrains.inspections.entities.Person;

/**
 * <p>Pattern Matching for instanceof</p>
 *
 * #PreviewFeature First Preview #JDK14<br/>
 * #PreviewFeature Second Preview #JDK15<br/>
 * #StandardFeature #JDK16<br/>
 */
@SuppressWarnings("unused")
public class PatternMatchingForInstanceOf {

    // Remember you can run these sorts of inspections over your whole application code
    private void inspectionToConvertInstanceof(Person person) {
        if (person instanceof Employee) {
            Employee employee = (Employee) person;
            if (employee.isBasedInOffice()) {
                employee.workFromHome();
            }
        }

        if (person instanceof Employee) {
            // 2021.1 / #JDK16 this can be replaced with a pattern variable
            Employee employee = (Employee) person;
            employee = new Employee();
            if (employee.isBasedInOffice()) {
                employee.workFromHome();
            }
        }
    }

    private void patternMatchingForInstanceOf(Person person) {
        if (person instanceof Employee employee) {
            // in #JDK16 you can change this pattern variable - IntelliJ IDEA marks mutated variables with underline
            employee = new Employee();

            if (employee.isBasedInOffice()) {
                employee.workFromHome();
            }
        }
        // in #JDK16 you will need to mark this as final if you don't want it to change
        // if a variable is final or effectively final, IntelliJ IDEA does not underline it
        if (person instanceof final Employee employee) {
            if (employee.isBasedInOffice()) {
                employee.workFromHome();
            }
        }
    }
}
