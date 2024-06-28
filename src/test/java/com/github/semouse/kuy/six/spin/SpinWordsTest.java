package com.github.semouse.kuy.six.spin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpinWordsTest {

    private final SpinWords spinner = new SpinWords();

    @Test
    void testSpin() {
        assertEquals("emocleW", spinner.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", spinner.spinWords("Hey fellow warriors"));
    }
}