package com.github.semouse.kuy.six.spin;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Write a function that takes in a string of one or more words, and returns the same string,
 * but with all words that have five or more letters reversed (Just like the name of this Kata).
 * Strings passed in will consist of only letters and spaces.
 * Spaces will be included only when more than one word is present.
 */
public class SpinWords {

    public String spinWords(String sentence) {
        return Stream.of(sentence.split(" "))
                .map(SpinWords::apply)
                .collect(Collectors.joining(" "));
    }

    private static String apply(String s) {
        if (s.length() >= 5) {
            s = new StringBuilder(s).reverse().toString();
        }

        return s;
    }
}
