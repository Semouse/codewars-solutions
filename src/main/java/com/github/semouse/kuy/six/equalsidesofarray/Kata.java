package com.github.semouse.kuy.six.equalsidesofarray;

import java.util.Arrays;

public class Kata {

    public static int findEvenIndex(int[] arr) {
        int leftSum = 0, rightSum = Arrays.stream(arr).sum();

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
