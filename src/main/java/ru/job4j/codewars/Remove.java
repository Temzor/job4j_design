package ru.job4j.codewars;

public class Remove {
    public static String remove(String s, int n) {
        while (n-- > 0) {
            s = s.replaceFirst("!", "");
        }
        return s;
    }
}
