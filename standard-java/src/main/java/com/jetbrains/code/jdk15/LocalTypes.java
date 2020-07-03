package com.jetbrains.code.jdk15;

import com.jetbrains.entity.Order;
import com.jetbrains.inspections.entities.Person;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toUnmodifiableSet;

@SuppressWarnings("unused")
public class LocalTypes {
    // local records
    private Set<Person> filterForPeopleWithFiveOrders(List<Person> people) {
        record PersonAndOrders(Person person, List<Order> orders) {
        }

        return people.stream()
                     .map(person -> new PersonAndOrders(person, getOrdersFor(person)))
                     .filter(personAndOrders -> personAndOrders.orders().size() == 5)
                     .map(PersonAndOrders::person)
                     .collect(toUnmodifiableSet());
    }

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


    //<editor-fold desc="Helper methods">
    @NotNull
    private List<Order> getOrdersFor(Person person) {
        return List.of();
    }
    //</editor-fold>
}
