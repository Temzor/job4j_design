package ru.codewars.eightkyu;

import java.util.Arrays;

public class IsAscOrder {
    public static boolean isAscOrder(int[] arr) {
        int[] arrayResult = Arrays.stream(arr).sorted().toArray();
        return Arrays.equals(arr, arrayResult);
    }
}
