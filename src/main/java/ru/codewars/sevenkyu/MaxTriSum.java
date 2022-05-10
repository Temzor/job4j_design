package ru.codewars.sevenkyu;

import java.util.Arrays;

public class MaxTriSum {
    public static int maxTriSum(int[] numbers) {
        int[] sort = Arrays
                .stream(numbers)
                .distinct()
                .sorted()
                .toArray();
        return sort[sort.length - 1] + sort[sort.length - 2] + sort[sort.length - 3];
    }
}
