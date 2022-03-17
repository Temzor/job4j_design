package ru.codewars.eightkyu;

public class NumberFun {
    public static long findNextSquare(long sq) {
        return Math.sqrt(sq) % 1 == 0 ? (long) Math.pow(Math.sqrt(sq) + 1, 2) : -1;
    }
}
