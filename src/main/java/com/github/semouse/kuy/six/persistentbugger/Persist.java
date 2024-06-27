package com.github.semouse.kuy.six.persistentbugger;

/**
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
 * which is the number of times you must multiply the digits in num until you reach a single digit.
 */
public class Persist {

    private Persist() {
        throw new IllegalStateException("Utility class");
    }

    public static int persistence(long n) {
        int count = 0;
        while (n >= 10) {
            n = String.valueOf(n).chars().reduce(1, (r, i) -> r * (i - '0'));
            count++;
        }
        return count;
    }
}