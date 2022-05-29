package ru.codewars.sevenkyu;

import static java.util.stream.IntStream.of;

public class HouseNumbersSum {
    public static int houseNumbersSum(final int[] arr) {
        return of(arr).takeWhile(e -> e > 0).sum();
    }
}
