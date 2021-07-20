package ru.job4j.codewars;

public class PaperWork {
    public static int paperWork(int n, int m) {
        return n < 0 || m < 0 ? 0 : n * m;
    }
}
