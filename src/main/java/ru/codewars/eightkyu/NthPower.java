package ru.codewars.eightkyu;

public class NthPower {
    public static int nthPower(int[] array, int n) {
        return array.length > n ? (int) Math.pow(array[n], n) : -1;
    }
}
