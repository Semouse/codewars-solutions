package com.github.semouse.kuy.six.order;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class OrderTest {

    private final Order order = new Order();

    @ParameterizedTest
    @MethodSource("provider")
    void testOrder(String expected, String input) {
        Assertions.assertEquals(expected, order.order(input));
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of("Thi1s is2 3a T4est", "is2 Thi1s T4est 3a"),
                Arguments.of("Fo1r the2 g3ood 4of th5e pe6ople", "4of Fo1r pe6ople g3ood th5e the2"),
                Arguments.of("", "")
        );
    }
}