package ru.codewars.eightkyu;

import java.util.Arrays;

public class TotalPoints {
    public static int points(String[] games) {
        return Arrays.stream(games)
                .mapToInt(s -> s.charAt(0) - s.charAt(2))
                .map(m -> m > 0 ? 3 : m == 0 ? 1 : 0)
                .sum();
    }
}
