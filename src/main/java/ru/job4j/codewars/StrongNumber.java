package ru.job4j.codewars;

import java.util.stream.IntStream;

public class StrongNumber {
    public static String isStrongNumber(int num) {
        return num == String.valueOf(num).chars()
                .map(Character::getNumericValue)
                .map(i -> IntStream.rangeClosed(1, i).reduce(1, (x, y) -> x * y))
                .sum() ? "STRONG!!!!" : "Not Strong !!";
    }
}

