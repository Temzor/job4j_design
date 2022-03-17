package ru.codewars.eightkyu;

import java.util.stream.IntStream;

public class Repeats {
    public static int repeats(int[] arr) {
        return 2 * IntStream.of(arr).distinct().sum() - IntStream.of(arr).sum();
    }
}
