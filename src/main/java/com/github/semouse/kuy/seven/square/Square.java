package com.github.semouse.kuy.seven.square;

/**
 * Given an integral number, determine if it's a square number:
 * <p>
 * In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.
 */
public class Square {

    private Square() {
    }

    public static boolean isSquare(int n) {
        int i = 0;
        while (i * i <= n) {
            if (i * i == n) {
                return true;
            }
            i++;
        }

        return false;
    }
}
