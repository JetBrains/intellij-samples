package com.jetbrains.code.jdk.preview;

import com.jetbrains.entity.Order;
import com.jetbrains.inspections.entities.Person;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toUnmodifiableSet;

/**
 * Local records/enums/interfaces.
 * #PreviewFeature First Preview #JDK15
 * #PreviewFeature Second Preview #JDK16
 */
@SuppressWarnings("unused")
public class LocalTypes {
    // local enums
    private void organisePeople(List<Person> people) {
        enum Role {Employee, Customer, Both, None}

        HashMap<Role, List<Person>> peopleByRole = new HashMap<>();
        people.stream()
              .filter(Person::isCustomer)
              .forEach(person -> peopleByRole.computeIfAbsent(Role.Customer, role -> new ArrayList<>())
                                             .add(person));
        // do more logic

        // do something with the values in peopleByRole
    }

    private void localInterfaces() {
        interface MyInterface {
            void doSomething(Person person);
        }

        // do something with MyInterface
    }


    //<editor-fold desc="Helper methods">
    @NotNull
    private List<Order> getOrdersFor(Person person) {
        return List.of();
    }
    //</editor-fold>
}
