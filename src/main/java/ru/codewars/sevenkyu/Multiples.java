package ru.codewars.sevenkyu;

public class Multiples {
    public static int[] multiples(int m, int n) {
        int[] result = new int[m];
        int start  = n;
        for (int i = 0; i < result.length; i++) {
            result[i] = start;
            start += n;
        }
        return result;
    }
}