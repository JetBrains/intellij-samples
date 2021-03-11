package com.jetbrains.inspections;

import com.jetbrains.inspections.entities.Employee;
import com.jetbrains.inspections.entities.Person;

import java.util.Objects;

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
    public void inspectionToConvertInstanceof(Person person) {
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

    public void extractVariableOrInline(Person person) {
        if (person instanceof Employee) {
            if (((Employee) person).isBasedInOffice()) {
                System.out.println("Works from the office");
            }
        }
    }

    public void examplesOfUpdatesToPatternMatchingInJava16(Person person) {
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

@SuppressWarnings("unused")
class LineItem {
    private String description;
    private double price;

    @Override
    public boolean equals(Object o) {
        if (o instanceof LineItem) {
            LineItem other = (LineItem) o;
            if (description.equals(other.description) && price == other.price) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, price);
    }
}
