package com.jetbrains.inspections;

import com.jetbrains.persistence.models.Customer;
import com.jetbrains.persistence.models.Order;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

@SuppressWarnings({"unused", "OptionalUsedAsFieldOrParameterType"})
public class OptionalInspections {
    private String getOptionalValue(Optional<String> firstOptional, Optional<String> secondOptional) {
        if (!firstOptional.isPresent() || !secondOptional.isPresent()) {
            throw new IllegalArgumentException("Neither Optional should not be empty");
        }
        return firstOptional.get() + secondOptional.get();
    }

    private String getOptionalValue(Optional<String> anOptional, boolean flag) {
        if (flag || anOptional.isPresent()) {
            return anOptional.get();
        }
        return "";
    }

    private String useOptionalProperlyOrElse(Optional<String> anOptional) {
        if (anOptional.isPresent()) {
            return anOptional.get();
        }
        return "";
    }

    public void simplifyOptionalCallChains1() {
        Optional<String> optional = getOptional();

        final Optional<String> trimOptional = optional.map(s -> Optional.of(s.trim()))
                                                      .orElse(Optional.empty());
    }

    public String simplifyOptionalCallChains2() {
        Optional<String> optional = getOptional();

        String value = optional.orElse(null);
        return value == null ? "default" : value;
    }

    public void simplifyOptionalCallChains3() {
        Optional<String> optional = getOptional();

        String value = optional.orElse(null);
        if (value != null) {
            System.out.println(value);
        }
    }

    public Optional<String> unnecessaryWrapping() {
        final Optional<String> optional = getOptional();

        return Optional.ofNullable(Stream.of("1", "2", "3")
                                         .filter(Objects::nonNull)
                                         .findFirst()
                                         .orElse(null));
    }

    @SuppressWarnings("OptionalIsPresent")
    public Optional<String> warnAboutWrappingOptional() {
        final Optional<String> optional = getOptional();
        if (optional.isPresent()) {
            return Optional.of(optional.get());
        }
        return Optional.empty();
    }

    @SuppressWarnings("SimplifyOptionalCallChains")
    public Optional<String> suggestJava9Or() {
        final Optional<String> optional = getOptional();
        if (optional.isPresent()) {
            return Optional.of(optional.get());
        }
        return getAlternativeOptional();
    }

    void optionalIsEmptyDataFlowSupport(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        Optional<String> min = list.stream()
                                   .map(String::trim)
                                   .min(String.CASE_INSENSITIVE_ORDER);
        if (min.isEmpty()) { // Always false
            return;
        }
        System.out.println(min.get());
    }

    // Java 9
    // NOTE: no inspection
    @SuppressWarnings("Convert2MethodRef")
    private void useOptionalProperlyWithOrElse(Optional<String> anOptional) {
        if (anOptional.isPresent()) {
            System.out.println(anOptional.get());
        } else {
            System.out.println("Nothing found!");
        }
//        anOptional.ifPresentOrElse(
//                s -> System.out.println(s),
//                () -> System.out.println("Nothing found!")
//        );
    }

    // NOTE: no inspection
    private Optional<Customer> useOptionalWithOr() {
        return getCurrentCustomer().or(this::getNextCustomer);
    }

    // NOTE: no inspection
    private Stream<Customer> useOptionalWithStream(Stream<Order> orders) {
        Stream<Optional<Customer>> streamOfOptionals = findCustomersWithOutstandingOrders();
        return streamOfOptionals.flatMap(customer -> customer.stream());
    }

    // Java 10
    // NOTE: no inspection
    private String getOptionalValueOrThrowDefaultException(Optional<String> anOptional) {
        return anOptional.orElseThrow();
    }

    // Java 11
    void invertingOptionalChoosesCorrectMethod(Optional<String> opt) {
        if (opt.isPresent()) { //.not postfix for isPresent
            System.out.println("Optional Value");
            System.out.println(opt.get());
        }
    }

    void notPresentReplacedWithIsEmpty(Optional<String> opt) {
        if (!opt.isPresent()) {
            throw new IllegalArgumentException("This should be here!");
        }
    }

    //<editor-fold desc="Helper Methods">
    private Optional<String> getOptional() {
        return Optional.empty();
    }

    private Optional<String> getAlternativeOptional() {
        return Optional.empty();
    }

    private Optional<Customer> getNextCustomer() {
        return Optional.empty();
    }

    private Optional<Customer> getCurrentCustomer() {
        return Optional.empty();
    }

    @NotNull
    private Stream<Optional<Customer>> findCustomersWithOutstandingOrders() {
        return Stream.of(Optional.of(new Customer()));
    }
    //</editor-fold>


}
