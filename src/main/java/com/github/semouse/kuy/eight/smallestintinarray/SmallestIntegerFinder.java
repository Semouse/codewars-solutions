package com.github.semouse.kuy.eight.smallestintinarray;

import java.util.Arrays;

/**
 * Given an array of integers your solution should find the smallest integer.
 * <p>
 * For example:
 * <p>
 * Given [34, 15, 88, 2] your solution will return 2
 * Given [34, -345, -1, 100] your solution will return -345
 * You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */
public class SmallestIntegerFinder {

    private SmallestIntegerFinder() {
        throw new IllegalStateException("Utility class");
    }

    public static int findSmallestInt(int[] array) {
        return Arrays.stream(array).min().orElseThrow(() -> new IllegalArgumentException("Array is Empty"));
    }
}
