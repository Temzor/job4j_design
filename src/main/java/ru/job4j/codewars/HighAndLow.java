package ru.job4j.codewars;

import java.util.Arrays;

public class HighAndLow {
    public static String highAndLow(String numbers) {
        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .min()
                .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .max()
                .getAsInt();

        return String.format("%d %d", max, min);
    }
}

