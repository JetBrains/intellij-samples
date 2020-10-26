package com.jetbrains.inspections;

import com.jetbrains.entity.Customer;
import com.jetbrains.entity.Order;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toUnmodifiableList;

@SuppressWarnings({"OptionalUsedAsFieldOrParameterType", "unused", "Convert2MethodRef", "UnnecessaryLocalVariable"})
public class NewMethodsOnOptional {
    // #ModernJava
    private String canUseIsEmpty(Optional<String> opt) {
        if (!opt.isPresent()) {
            throw new IllegalArgumentException("This should not be empty!");
        }

        return opt.get();
    }

    // Java 10
    private String getOptionalValueOrThrowDefaultException(Optional<String> anOptional) {
        return anOptional.orElseThrow();
    }

    // Java 9
    private void optionalIfPresentOrElse(Optional<String> anOptional) {
        anOptional.ifPresentOrElse(s -> doSomethingWith(s),
                                   () -> doSomethingElse());
    }

    // Java 9
    private Optional<Customer> useOptionalWithOr() {
        Optional<Customer> optionalCustomer = getCurrentCustomer().or(this::getNextCustomer);
        return optionalCustomer;
    }

    // Java 9
    private List<Customer> useOptionalWithStream(Stream<Order> orders) {
        Stream<Optional<Customer>> streamOfOptionals = findCustomersWithOutstandingOrders();
        return streamOfOptionals.flatMap(customer -> customer.stream())
                                .collect(toUnmodifiableList());
    }


    //<editor-fold desc="Helper Methods">
    private void doSomethingWith(String s) {

    }

    private void doSomethingElse() {

    }

    private Optional<Customer> getNextCustomer() {
        return Optional.empty();
    }

    private Optional<Customer> getCurrentCustomer() {
        return Optional.empty();
    }

    @NotNull
    private Stream<Optional<Customer>> findCustomersWithOutstandingOrders() {
        return Stream.of(Optional.of(new Customer("Riley", "Last-Name")));
    }
    //</editor-fold>

}
