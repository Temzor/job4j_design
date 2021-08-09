package ru.job4j.codewars;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Factorial {
    public int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        }
        return n == 0 ? 1 : n * factorial(n - 1);
    }
}
