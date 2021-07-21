package ru.job4j.codewars;

import java.util.Arrays;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers)
                .filter(a -> a % divider == 0)
                .toArray();
    }
}
