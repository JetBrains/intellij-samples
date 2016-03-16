package com.jetbrains.inspections;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.google.common.collect.FluentIterable;

import java.util.Optional;
import java.util.concurrent.Callable;

public class GuavaMigration {
    Optional<Callable> callMeMaybe;
    FluentIterable<Object> fluentIterable;
    Function<Object, Object> function;
    Predicate<Object> predicate;
    Supplier<Object> supplier;
}
