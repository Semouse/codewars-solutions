package com.github.semouse.kuy.six.equalsidesofarray;

import java.util.Arrays;

/**
 * You are going to be given an array of integers. Your job is to take that array and find an index N where the sum of the integers to the left of N is equal to the sum of the integers to the right of N.
 * <p>
 * If there is no index that would make this happen, return -1.
 */
public class Kata {

    private Kata() {
        throw new IllegalStateException("Utility class");
    }

    public static int findEvenIndex(int[] arr) {
        int leftSum = 0;
        int rightSum = Arrays.stream(arr).sum();

        for (int i = 0; i < arr.length; i++) {
            rightSum -= arr[i];
            if (rightSum == leftSum) {
                return i;
            }
            leftSum += arr[i];
        }

        return -1;
    }
}
