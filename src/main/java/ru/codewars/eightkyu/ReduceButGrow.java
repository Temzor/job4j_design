package ru.codewars.eightkyu;

public class ReduceButGrow {
    public static int grow(int[] x) {
        int result = 1;

        for (int i : x) {
            result *= i;
        }
        return result;
    }
}
