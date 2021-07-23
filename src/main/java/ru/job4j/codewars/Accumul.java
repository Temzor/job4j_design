package ru.job4j.codewars;

public class Accumul {

    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    result.append(Character.toUpperCase(currentChar));
                } else {
                    result.append(Character.toLowerCase(currentChar));
                }
            }
            result.append("-");
        }
        return result.substring(0, result.length() - 1);
    }
}
