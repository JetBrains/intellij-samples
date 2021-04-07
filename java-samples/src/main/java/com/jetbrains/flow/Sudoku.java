package com.jetbrains.flow;

import java.util.HashMap;
import java.util.Map;

public class Sudoku {
    private Map<Location, Integer> locations = new HashMap<>();

    public int getNumberOfColumns() {
        return 9;
    }

    public int getNumberOfRows() {
        return 9;
    }

    public void addValueAt(int value, Location location) {
        locations.put(location, value);
    }

    public int getValueAt(Location location) {
        return locations.get(location);
    }
}
