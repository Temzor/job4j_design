package ru.codewars.eightkyu;

import java.util.stream.IntStream;

public class PipeFix {
    public static int[] pipeFix(int[] numbers) {
        return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
    }
}
