package ru.job4j.codewars;

import java.util.List;

public class BinaryArrayToNumber {
    public static int convertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder numbers = new StringBuilder();
        for (Integer integer : binary) {
            numbers.append(integer);
        }
        return Integer.parseInt(String.valueOf(numbers), 2);
    }
}
