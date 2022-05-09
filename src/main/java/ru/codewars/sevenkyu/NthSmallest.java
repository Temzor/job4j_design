package ru.codewars.sevenkyu;

import java.util.Arrays;

public class NthSmallest {
    public static int nthSmallest(final int[] arr, final int n) {
        Arrays.sort(arr);
        return arr[n - 1];
    }
}
