package com.github.semouse.kuy.six.convert;

/**
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 * The first word within the output should be capitalized only if the original word was
 * capitalized (known as Upper Camel Case,also often referred to as Pascal case).
 * The next words should be always capitalized.
 */
public class ToCamelCaseConverter {

    private ToCamelCaseConverter() {
        throw new IllegalStateException("Utility class");
    }

    public static String toCamelCase(String phrase) {
        StringBuilder builder = new StringBuilder();
        boolean toUpperCase = false;
        for (char c : phrase.toCharArray()) {
            if (Character.isLetter(c)) {
                builder.append(toUpperCase ? Character.toUpperCase(c) : c);
                toUpperCase = false;
            } else {
                toUpperCase = true;
            }
        }
        return builder.toString();
    }
}
