package ru.job4j.codewars;

public class DivSeven {
    public static long[] seven(long m) {
        long step = 0;
        while (m > 99) {
            long first = m / 10;
            long second = m % 10;
            m = first - 2 * second;
            step++;
        }
        return new long[] {m, step};
    }
}
