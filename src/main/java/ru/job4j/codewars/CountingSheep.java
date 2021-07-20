package ru.job4j.codewars;

public class CountingSheep {
    public static String countingSheep(int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += i + 1 + " sheep...";

        }
        return result;
    }
}
