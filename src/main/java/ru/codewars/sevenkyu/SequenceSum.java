package ru.codewars.sevenkyu;

public class SequenceSum {
    public static int[] sumOfN(int n) {

        int[] sum = new int[Math.abs(n) + 1];

        if (n < 0) {
            for (int i = -1; i >= n; i--) {
                sum[Math.abs(i)] = i + sum[Math.abs(i) - 1];
            }
        }
        for (int i = 1; i <= n; i++) {
            sum[i] = i + sum[i - 1];
        }

        return sum;
    }
}
