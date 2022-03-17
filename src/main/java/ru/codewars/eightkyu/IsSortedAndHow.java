package ru.codewars.eightkyu;


import java.util.stream.IntStream;

public class IsSortedAndHow {
    public static String isSortedAndHow(int[] array) {
        if (IntStream.range(0, array.length - 1).allMatch(i -> array[i] <= array[i + 1])) {
            return "yes, ascending";
        }

        if (IntStream.range(0, array.length - 1).allMatch(i -> array[i] >= array[i + 1])) {
            return "yes, descending";
        }

        return "no";
    }
}
