package com.github.semouse.kuy.seven.square;

/**
 * Given an integral number, determine if it's a square number:
 * <p>
 * In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.
 */
public class Square {

    private Square() {
    }

    public static long findNextSquare(long sq) {
        if(!isSquare(sq)){
            return - 1;
        }
        long n = (long) Math.sqrt(sq) + 1;
        return n * n;
    }

    public static boolean isSquare(long n) {
        return Math.sqrt(n) % 1 == 0;
    }
}
