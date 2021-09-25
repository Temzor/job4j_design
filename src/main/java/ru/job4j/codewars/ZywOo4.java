package ru.job4j.codewars;

import java.util.stream.IntStream;


public class ZywOo4 {
    public static int[] multipleOfIndex(int[] array) {
        return IntStream
                .range(1, array.length)
                .filter(i -> array[i] % i == 0)
                .map(i -> array[i])
                .toArray();
    }
}

