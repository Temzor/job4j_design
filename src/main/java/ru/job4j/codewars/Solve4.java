package ru.job4j.codewars;

import java.util.Arrays;

public class Solve4 {
    public static int solve(int[] arr) {
        return Arrays.stream(arr).distinct().sum();
    }
}
