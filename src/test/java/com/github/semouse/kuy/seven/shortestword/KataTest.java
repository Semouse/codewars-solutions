package com.github.semouse.kuy.seven.shortestword;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {

    @ParameterizedTest
    @MethodSource("provideStrings")
    void testFindShort(int expected, String sentence) {
        assertEquals(expected, Kata.findShort(sentence));
    }

    private static Stream<Arguments> provideStrings() {
        return Stream.of(
                Arguments.of(3, "bitcoin take over the world maybe who knows perhaps"),
                Arguments.of(3, "turns out random test cases are easier than writing out basic ones"),
                Arguments.of(2, "Let's travel abroad shall we")
        );
    }
}