package ru.codewars.eightkyu;

import java.util.Arrays;

public class MaxDiffLength {
    public static int maxDiffLength(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }
        return Math.max(Arrays.stream(a1).mapToInt(String::length).max().getAsInt() - Arrays.stream(a2).mapToInt(String::length).min().getAsInt(),
                Arrays.stream(a2).mapToInt(String::length).max().getAsInt() - Arrays.stream(a1).mapToInt(String::length).min().getAsInt());

    }
}
