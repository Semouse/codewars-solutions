package com.github.semouse.kuy.six.order;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
 * <p>
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * <p>
 * If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
 */
public class Order {

    public String order(String words) {
        if (words.isEmpty()) {
            return words;
        }

        return Stream.of(words.split(" "))
                .sorted((Order::compare))
                .collect(Collectors.joining(" "));
    }

    private static int compare(String o1, String o2) {
        int left = Integer.parseInt(o1.replaceAll("\\D", ""));
        int right = Integer.parseInt(o2.replaceAll("\\D", ""));

        return Integer.compare(left, right);
    }
}
