package com.jetbrains.inspections;

import com.jetbrains.entity.Customer;
import com.jetbrains.entity.Order;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toUnmodifiableList;

/**
 * Since #JDK8, java.util.Optional has had more methods added (in #JDK9, #JDK10, and #JDK11). IntelliJ IDEA can help use
 * some of these methods where it makes sense. It's helpful to be aware of them so we can use Optional more effectively.
 */
@SuppressWarnings({"OptionalUsedAsFieldOrParameterType", "unused", "Convert2MethodRef", "UnnecessaryLocalVariable"})
public class NewMethodsOnOptional {
    // #ModernJava #JDK11
    private String canUseIsEmpty(Optional<String> opt) {
        if (!opt.isPresent()) {
            throw new IllegalArgumentException("This should not be empty!");
        }

        return opt.get();
    }

    // #JDK10
    private String getOptionalValueOrThrowDefaultException(Optional<String> anOptional) {
        return anOptional.orElseThrow();
    }

    // #JDK9
    private void optionalIfPresentOrElse(Optional<String> anOptional) {
        anOptional.ifPresentOrElse(s -> doSomethingWith(s),
                                   () -> doSomethingElse());
    }

    // #JDK9
    private Optional<Customer> useOptionalWithOr() {
        Optional<Customer> optionalCustomer = getCurrentCustomer().or(this::getNextCustomer);
        return optionalCustomer;
    }

    // #JDK9
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
