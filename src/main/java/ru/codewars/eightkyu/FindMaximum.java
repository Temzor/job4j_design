package ru.codewars.eightkyu;

import java.util.Arrays;

public class FindMaximum {
    public static int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public static int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }
}
