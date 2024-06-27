package com.github.semouse.kuy.seven.reverse;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordReverserTest {
    @ParameterizedTest
    @MethodSource("provider")
    void testReverseWords(String expected, String input) {
        assertEquals(expected, WordReverser.reverseWords(input));
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of("ehT kciuq nworb xof spmuj revo eht yzal .god",
                        "The quick brown fox jumps over the lazy dog."),
                Arguments.of("elppa", "apple"),
                Arguments.of("a b c d", "a b c d"),
                Arguments.of("elbuod  decaps  sdrow", "double  spaced  words"),
                Arguments.of("   ", "   ")
        );
    }
}