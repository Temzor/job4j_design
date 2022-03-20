package ru.codewars.sevenkyu;

public class MaxDiff {
    public int maxDiff(int[] lst) {
        if (lst.length < 2) {
            return 0;
        }
        int max = lst[0];
        int min = lst[lst.length - 1];

        for (int j : lst) {
            if (max > j) {
                max = j;
            }

            if (min < j) {
                min = j;
            }
        }

        return Math.abs(max - min);
    }
}
