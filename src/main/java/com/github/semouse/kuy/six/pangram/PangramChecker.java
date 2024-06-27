package com.github.semouse.kuy.six.pangram;

import java.util.HashSet;
import java.util.Set;

/**
 * A pangram is a sentence that contains every single letter of the alphabet at least once.
 * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
 * because it uses the letters A-Z at least once (case is irrelevant).
 */
public class PangramChecker {

    public boolean isPangram(String sentence) {
        Set<Character> alphabet = new HashSet<>();
        for (char c : sentence.toLowerCase().toCharArray()) {
            alphabet.add(c);
            if (alphabet.size() == 26) {
                return true;
            }
        }

        return false;
    }
}
