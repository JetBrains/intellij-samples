package com.jetbrains.inspections;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

@SuppressWarnings("unused")
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

    //<editor-fold desc="Helper Methods">
    private Optional<String> getOptional() {
        return Optional.empty();
    }

    private Optional<String> getAlternativeOptional() {
        return Optional.empty();
    }
    //</editor-fold>


}
