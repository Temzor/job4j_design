package ru.job4j.codewars;

public class Bumps {
    public static String bumps(final String road) {
        char someChar = 'n';
        int count = 0;
        for (int i = 0; i < road.length(); i++) {
            if (road.charAt(i) == someChar) {
                count++;
            }
        }
        return count >= 15 ? "Car Dead" : "Woohoo!";
    }
}