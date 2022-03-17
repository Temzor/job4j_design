package ru.codewars.eightkyu;

import java.util.stream.IntStream;

public class LargestFiveDigitNumber {
    public static int solve(final String digits) {
        return IntStream.range(0, digits.length() - 4)
                .mapToObj(i -> digits.substring(i, i + 5))
                .mapToInt(Integer::parseInt)
                .max()
                .orElse(0);
    }
}
