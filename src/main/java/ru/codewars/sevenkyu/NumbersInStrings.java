package ru.codewars.sevenkyu;

public class NumbersInStrings {
    public static int numbersInStrings(String s) {
        String[] splitChar = s.split("");

        for (String value : splitChar) {
            if (!value.matches("[-+]?\\d+")) {
                s = s.replaceAll(value, " ").replaceAll(" {2}", " ");
            }
        }

        String[] result = s.trim().split(" ");
        int max = 0;
        for (String value : result) {
            if (Integer.parseInt(value) > max) {
                max = Integer.parseInt(value);
            }
        }
        return max;
    }
}
