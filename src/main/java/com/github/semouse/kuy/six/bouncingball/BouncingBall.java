package com.github.semouse.kuy.six.bouncingball;

public class BouncingBall {

    private BouncingBall() {
        throw new IllegalStateException("Utility class");
    }

    public static int bouncingBall(double height, double bounce, double window) {
        if (height <= 0 || (bounce <= 0 || bounce >= 1) || window >= height) {
            return -1;
        }

        int count = 0;
        while (height > window) {
            height = height * bounce;
            count = height > window ? count + 2 : count + 1;
        }

        return count;
    }
}
