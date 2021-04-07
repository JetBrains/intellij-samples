package com.jetbrains.flow;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.jetbrains.flow.Location.location;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class SudokuTest {
    private final Sudoku sudoku = new Sudoku();

    @Test
    @DisplayName("Should have 9 columns")
    void shouldHave9Columns() {
        Sudoku sudoku = new Sudoku();
        assertEquals(9, sudoku.getNumberOfColumns());
    }

    @Test
    @DisplayName("Should have 9 rows")
    void shouldHave9Rows() {
        assertEquals(9, sudoku.getNumberOfRows());
    }

    @Test
    @DisplayName("Should let me add a number")
    void shouldLetMeAddANumber() {
        // given
        Location location = location(1, 1);

        // when
        sudoku.addValueAt(1, location);

        // then
        assertEquals(1, sudoku.getValueAt(location));
    }

    @Test
    @DisplayName("Should not let me add more than 9 numbers")
    @Disabled("Not implemented yet")
    void shouldNotLetMeAddMoreThan9Numbers() {
        // given
        Location location = location(1, 1);

        // when
        sudoku.addValueAt(1, location);

        // then
        assertEquals(1, sudoku.getValueAt(location));

        fail("Not implemented");
    }
}