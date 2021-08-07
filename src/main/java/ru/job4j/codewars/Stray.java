package ru.job4j.codewars;

import java.util.Arrays;

public class Stray {
    static int stray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0] != numbers[1] ? numbers[0] : numbers[numbers.length - 1];
    }
}
