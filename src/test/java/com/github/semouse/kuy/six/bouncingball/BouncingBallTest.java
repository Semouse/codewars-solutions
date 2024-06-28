package com.github.semouse.kuy.six.bouncingball;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BouncingBallTest {
    @ParameterizedTest
    @MethodSource("provider")
    void bouncingBall(int expected, double height, double bounce, double window) {
        assertEquals(expected, BouncingBall.bouncingBall(height, bounce, window));
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(3, 3.0, 0.66, 1.5),
                Arguments.of(15, 30.0, 0.66, 1.5)
        );
    }
}