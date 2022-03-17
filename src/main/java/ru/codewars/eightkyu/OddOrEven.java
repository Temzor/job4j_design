package ru.codewars.eightkyu;

import java.util.Arrays;

public class OddOrEven {
    public static String oddOrEven(int[] array) {
        return Arrays.stream(array).sum() % 2 != 0 ? "odd" : "even";
    }
}
