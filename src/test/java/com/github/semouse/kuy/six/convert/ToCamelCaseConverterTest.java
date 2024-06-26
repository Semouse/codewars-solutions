package com.github.semouse.kuy.six.convert;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToCamelCaseConverterTest {
    @ParameterizedTest
    @MethodSource("provider")
    void testSomeUnderscoreLowerStart(String expected, String input) {
        assertEquals(expected, ToCamelCaseConverter.toCamelCase(input));
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of("theStealthWarrior", "the-stealth-warrior"),
                Arguments.of("TheStealthWarrior", "The_Stealth_Warrior"),
                Arguments.of("TheStealthWarrior", "The_Stealth-Warrior")
        );
    }
}