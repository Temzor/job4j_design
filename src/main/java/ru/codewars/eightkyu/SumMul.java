package ru.codewars.eightkyu;

public class SumMul {
    public long sumMul(int n, int m) {
        if (n <= 0 || m <= 0) {
            throw new IllegalArgumentException();
        }
        long sum = 0;
        for (long i = 1; i * n <  m; i++) {
            sum = sum + (i * n);
        }
        return sum;
    }
}

