package com.github.semouse.kuy.seven.square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void isSquare() {
        assertTrue(Square.isSquare(4));
        assertTrue(Square.isSquare(25));
        assertTrue(Square.isSquare(0));
    }

    @Test
    void isNotSquare() {
        assertFalse(Square.isSquare(-1));
        assertFalse(Square.isSquare(26));
        assertFalse(Square.isSquare(3));
    }

    @Test
    void findNextSquare() {
        assertEquals(144, Square.findNextSquare(121));
        assertEquals(676, Square.findNextSquare(625));
        assertEquals(-1, Square.findNextSquare(114));
    }
}