package ru.job4j.codewars;


import java.util.Arrays;

public class ZywOo5 {
    public static int sumOfDifferences(int[] arr) {
        Arrays.sort(arr);
        return arr.length <= 1 ? 0 : arr[arr.length - 1] - arr[0];
    }
}
