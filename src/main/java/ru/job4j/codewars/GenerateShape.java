package ru.job4j.codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GenerateShape {
    public static String generateShape(int n) {
        return IntStream
                .range(0, n)
                .mapToObj(x -> "+".repeat(n))
                .collect(Collectors.joining("\n"));
    }
}