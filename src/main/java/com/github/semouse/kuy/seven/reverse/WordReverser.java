package com.github.semouse.kuy.seven.reverse;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Complete the function that accepts a string parameter, and reverses each word in the string.
 * All spaces in the string should be retained.
 * <p>
 * "This is an example!" ==> "sihT si na !elpmaxe"
 * "double  spaces"      ==> "elbuod  secaps"
 */
public class WordReverser {

    private WordReverser() {
        throw new IllegalStateException("Utility class");
    }

    public static String reverseWords(final String original) {
        if (original.isBlank()) {
            return original;
        }

        return Arrays.stream(original.split(" "))
                .map(WordReverser::reverseWord)
                .collect(Collectors.joining(" "));
    }

    private static String reverseWord(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString();
    }
}
