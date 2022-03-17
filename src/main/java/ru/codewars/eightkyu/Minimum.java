package ru.codewars.eightkyu;

import java.util.Arrays;

public class Minimum {
    public static int minValue(int[] values) {
        return Arrays.stream(values)
                .distinct()
                .sorted()
                .reduce((r, a) -> r * 10 + a).orElse(0);
    }
}
