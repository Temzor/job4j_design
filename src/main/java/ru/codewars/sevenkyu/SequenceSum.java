package ru.codewars.sevenkyu;

public class SequenceSum {
    public static int[] sumOfN(int n) {
        int[] result = new int[Math.abs(n) + 1];
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i - 1] + (n > 0 ? i : -i);
        }
        return result;
    }
}
