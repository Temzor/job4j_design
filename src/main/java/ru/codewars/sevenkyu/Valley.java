package ru.codewars.sevenkyu;

import java.util.stream.IntStream;

public class Valley {
    public int[] makeValley(int[] arr) {
        int[] sorted = IntStream.of(arr).sorted().toArray();
        for (int i = 0; i < sorted.length; i++) {
            arr[i % 2 == 0 ? i / 2 : sorted.length - 1 - i / 2] = sorted[sorted.length - i - 1];
        }
        return arr;
    }
}