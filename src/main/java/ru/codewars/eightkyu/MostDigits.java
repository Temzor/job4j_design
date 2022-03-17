package ru.codewars.eightkyu;


import java.util.stream.IntStream;

public class MostDigits {
    public static int findLongest(int[] numbers) {
        return IntStream.of(numbers).reduce(0, (a, b) -> String.valueOf(Math.abs(a)).length() >= String.valueOf(Math.abs(b)).length() ? a : b);
    }
}
