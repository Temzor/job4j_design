package ru.codewars.eightkyu;

public class PowersOfTwo {
    public static long[] powersOfTwo(int n) {
        long[] longResult = new long[n + 1];
        longResult[0] = 1;
        for (int i = 1; i <= n; i++) {
            longResult[i] = longResult[i - 1] * 2L;
        }
        return longResult;
    }
}
