package ru.job4j.codewars;

import java.util.Arrays;

public class Well {
    public static String well(String[] x) {
        int count = (int) Arrays.stream(x)
                .filter(a -> a.equals("good"))
                .count();

        return count == 0 ? "Fail!" : count > 2 ? "I smell a series!" : "Publish!";
    }
}
