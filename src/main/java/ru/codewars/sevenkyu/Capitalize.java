package ru.codewars.sevenkyu;

public class Capitalize {
    public static String capitalize(String s, int[] ind) {
        char[] array = s.toCharArray();
        for (int j : ind) {
            if (j < s.length()) {
                array[j] = Character.toUpperCase(array[j]);
            }
        }
        return String.valueOf(array);
    }
}