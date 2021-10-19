package com.jetbrains.editing;

import com.jetbrains.entity.Customer;

import java.util.List;
import java.util.stream.Stream;

import static com.jetbrains.editing.ParameterHints.findCustomer;

@SuppressWarnings("unused")
public class InlayHints {
    private Customer inlayHintsShownForParameterNames(String name) {
        return findCustomer(name, null, null, 0, true);
    }

    private void inlayHintsForChainedMethods() {
        Stream.of(1, 2, 3)
              .filter(it -> it % 2 == 0)
              .map(it -> "item: " + it)
              .forEach(System.out::println);
    }

    private void inlayHintsShownForImplicitTypes() {
        var customers = List.of(new Customer("First", "Last"));
    }
}
