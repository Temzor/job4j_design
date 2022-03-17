package ru.codewars.eightkyu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MaxNumber {
    public static long maxNumber(long n) {
        return Long.parseLong(
                Arrays.stream((n + "")
                        .split(""))
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.joining())
        );
    }
}
