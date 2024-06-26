package com.github.semouse.kuy.eight.smallestintinarray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallestIntegerFinderTest {

    @ParameterizedTest
    @MethodSource("provider")
    void testFindSmallestInt(int expected, int[] array) {
        assertEquals(expected, SmallestIntegerFinder.findSmallestInt(array));
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(11, new int[]{78, 56, 232, 12, 11, 43}),
                Arguments.of(-33, new int[]{78, 56, -2, 12, 8, -33}),
                Arguments.of(Integer.MIN_VALUE, new int[]{0, Integer.MIN_VALUE, Integer.MAX_VALUE})
        );
    }

}