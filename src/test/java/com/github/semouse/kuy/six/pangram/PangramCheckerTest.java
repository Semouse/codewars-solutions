package com.github.semouse.kuy.six.pangram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PangramCheckerTest {
    private final PangramChecker checker = new PangramChecker();

    @Test
    void isPangram() {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        assertTrue(checker.isPangram(sentence));
    }

    @Test
    void isNotPangram(){
        String sentence = "You shall not pass!";
        assertFalse(checker.isPangram(sentence));
    }
}