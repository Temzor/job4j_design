package ru.job4j.codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiTable {
    public static String multiTable(int num) {
        return IntStream.rangeClosed(1, 10)
                .mapToObj(i -> i + " * " + num + " = " + i * num)
                .collect(Collectors.joining("\n"));
    }
}
