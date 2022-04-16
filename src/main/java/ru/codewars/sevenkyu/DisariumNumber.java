package ru.codewars.sevenkyu;

import java.util.stream.IntStream;

public class DisariumNumber {
    public static String disariumNumber(int number) {
        int[] numbers = Integer.toString(number)
                .chars()
                .map(Character::getNumericValue)
                .toArray();

        return IntStream.range(0, numbers.length)
                .map(index -> (int) Math.pow(numbers[index], index + 1))
                .sum() == number ? "Disarium !!" : "Not !!";
    }
}
