package com.github.semouse.kuy.seven.isograms;

import java.util.HashSet;
import java.util.Set;

/**
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.
 */
public class Isogram {

    private Isogram() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isIsogram(String str) {
        Set<Character> occurrences = new HashSet<>();
        for (char c : str.toLowerCase().toCharArray()) {
            if (!occurrences.add(c)) {
                return false;
            }
        }

        return true;
    }
}
