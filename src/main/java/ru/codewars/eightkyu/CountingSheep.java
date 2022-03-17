package ru.codewars.eightkyu;

public class CountingSheep {
    public static String countingSheep(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num; i++) {
            result.append(i).append(1).append(" sheep...");

        }
        return result.toString();
    }
}
