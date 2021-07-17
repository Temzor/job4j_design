package ru.job4j.codewars;

public class Positive {
    public static int sum(int[] arr) {
        int sumPositive  = 0;
        for (int i : arr) {
            if (i > 0) {
                sumPositive += i;
            }
        }
        return Math.max(sumPositive, 0);
    }

}
