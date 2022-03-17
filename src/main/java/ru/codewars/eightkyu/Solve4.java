package ru.codewars.eightkyu;

import java.util.Arrays;

public class Solve4 {
    public static int solve(int[] arr) {
        return Arrays.stream(arr).distinct().sum();
    }
}