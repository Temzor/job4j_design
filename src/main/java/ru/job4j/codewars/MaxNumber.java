package ru.job4j.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MaxNumber {
    public static long maxNumber(long n) {
        return Long.parseLong(
                Arrays.stream((n + "")
                        .split(""))
                        .sorted((x, y) -> y.compareTo(x))
                        .collect(Collectors.joining())
        );
    }
}
