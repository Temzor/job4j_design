package ru.codewars.sevenkyu;

public class Solve {
    public static int solve(int[] arr) {
        int countTruePair = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0) {
                if (arr[i + 1] == arr[i] + 1 || arr[i + 1] == arr[i] - 1) {
                    countTruePair++;
                }

            }
        }
        return countTruePair;
    }
}
