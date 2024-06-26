package com.github.semouse.kuy.seven.shortestword;

import java.util.stream.Stream;

/**
 * Simple, given a string of words, return the length of the shortest word(s).
 * <p>
 * String will never be empty, and you do not need to account for different data types.
 */
public class Kata {

    private Kata() {
        throw new IllegalStateException("Utility class");
    }

    public static int findShort(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .orElse(-1);
    }
}
