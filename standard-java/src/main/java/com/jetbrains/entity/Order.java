package com.jetbrains.entity;

import java.util.List;

public record Order(List<Item> items, State state) {

    public enum State {
        DELIVERED
    }
}
