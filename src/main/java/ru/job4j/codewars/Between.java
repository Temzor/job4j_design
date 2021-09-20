package ru.job4j.codewars;

import static java.util.stream.IntStream.rangeClosed;

public class Between {
    public static int[] between(int a, int b) {
        return rangeClosed(a, b).toArray();
    }
}
