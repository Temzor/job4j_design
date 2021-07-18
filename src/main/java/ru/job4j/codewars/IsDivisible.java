package ru.job4j.codewars;

public class IsDivisible {
    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }
}