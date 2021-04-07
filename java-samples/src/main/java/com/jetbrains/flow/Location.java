package com.jetbrains.flow;

public record Location(int rowIndex, int columnIndex) {
    public static Location location(int rowIndex, int columnIndex) {
        return new Location(rowIndex, columnIndex);
    }
}
