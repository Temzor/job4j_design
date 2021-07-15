package ru.job4j.codewars;

public class DoubleCola {
    public static String whoIsNext(String[] names, int n) {
        n = n - 1;
        int len = names.length;

        while (n >= len) {
            int div = n - len;
            n = (int) Math.floor(div >> 1);
        }
        return names[n];
    }
}