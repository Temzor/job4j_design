package ru.job4j.codewars;

public class Capitalize {
    public static String[] capitalize(String s) {
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        String[] split = s.split("");
        for (int i = 0; i < split.length; i++) {
            if (i % 2 != 0) {
                result1.append(split[i].toUpperCase());
            } else {
                result1.append(split[i]);
            }
        }

        for (int i = 0; i < split.length; i++) {
            if (i % 2 == 0) {
                result2.append(split[i].toUpperCase());
            } else {
                result2.append(split[i]);
            }
        }

        return new String[] {result2.toString(), result1.toString()};
    }
}
