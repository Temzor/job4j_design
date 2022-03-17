package ru.codewars.eightkyu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords7Kyu {
    public static String reverseWords(final String original) {
        return Arrays.stream(original.split("(?<=\\s)|(?=\\s+)"))
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining());
    }
}
