package ru.job4j.codewars;

import java.util.Arrays;

public class Take {
    public static int[] take(int[] arr, int n) {
        return Arrays.stream(arr).limit(n).toArray();
    }
}
