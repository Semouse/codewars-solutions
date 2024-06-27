package com.github.semouse.kuy.six.persistentbugger;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersistTest {

    @ParameterizedTest
    @MethodSource("provider")
    void testPersistence(int expected, int input) {
        assertEquals(expected, Persist.persistence(input));
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(3, 39),
                Arguments.of(0, 4),
                Arguments.of(2, 25),
                Arguments.of(4, 999)
        );
    }
}