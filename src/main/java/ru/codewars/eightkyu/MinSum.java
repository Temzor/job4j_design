package ru.codewars.eightkyu;

import java.util.Arrays;

public class MinSum {
    public static int minSum(int[] passed) {
        int[] sorted = Arrays.stream(passed)
                .sorted()
                .toArray();
        int sum = 0;
        for (int i = 0; i < passed.length / 2; i++) {
            sum += sorted[i] * sorted[sorted.length - 1 - i];
        }
        return sum;
    }
}
