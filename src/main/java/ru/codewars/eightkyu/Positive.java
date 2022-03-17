package ru.codewars.eightkyu;

import java.util.Arrays;

public class Positive {
    public static int sum(int[] arr) {
        return Arrays
                .stream(arr)
                .filter(value -> value > 0)
                .sum();
    }
}
