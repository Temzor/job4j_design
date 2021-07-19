package ru.job4j.codewars;

public class Clock {
    public static int past(int h, int m, int s) {
        return (h * 3600000) + (m * 60000) + (s * 1000);
    }
}
