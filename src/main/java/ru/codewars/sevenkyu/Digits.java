package ru.codewars.sevenkyu;

public class Digits {
    public static int digits(long n) {
        return String.valueOf(n).split("").length;
    }
}
