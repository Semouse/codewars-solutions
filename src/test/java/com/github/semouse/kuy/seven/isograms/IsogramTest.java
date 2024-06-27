package com.github.semouse.kuy.seven.isograms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class IsogramTest {

    @ParameterizedTest
    @ValueSource(strings = {"Dermatoglyphics", "isogram", "thumbscrewjapingly", ""})
    void testIsogram(String input) {
        assertTrue(Isogram.isIsogram(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"moose", "isIsogram", "aba", "moOse"})
    void testNoIsogram(String input) {
        assertFalse(Isogram.isIsogram(input));
    }
}