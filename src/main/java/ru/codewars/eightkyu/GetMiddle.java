package ru.codewars.eightkyu;

public class GetMiddle {
    public static String getMiddle(String word) {
        String[] split = word.split("");
        if (split.length % 2 == 0) {
            return split[split.length / 2 - 1] + split[split.length / 2];
        } else {
            return split[split.length / 2];
        }
    }
}
