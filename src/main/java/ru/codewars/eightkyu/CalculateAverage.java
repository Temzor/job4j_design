package ru.codewars.eightkyu;

import java.util.Arrays;

public class CalculateAverage {
    public static double findAverage(int[] array) {
        return Arrays.stream(array).average().orElse(0);

    }
}
