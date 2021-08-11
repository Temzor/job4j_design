package ru.job4j.codewars;

public class Solve {
    public static String solve(final String str) {
        int counterUpper = 0;
        String[] strings = str.split("");
        String[] stringsUpper = str.toUpperCase().split("");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(stringsUpper[i])) {
                counterUpper++;
        }
        }
        return counterUpper > strings.length / 2 ? str.toUpperCase() : str.toLowerCase();
    }
}
