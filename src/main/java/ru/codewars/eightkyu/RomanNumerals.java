package ru.codewars.eightkyu;

public class RomanNumerals {

    public static String toRoman(int n) {
        String s = "";
        String[] r = {"I", "V", "X", "L", "C", "D", "M"};
        int j = 0;
        while (n > 0) {
            s = switch (n % 10) {
                case 1 -> r[j] + s;
                case 2 -> r[j] + r[j] + s;
                case 3 -> r[j] + r[j] + r[j] + s;
                case 4 -> r[j] + r[j + 1] + s;
                case 5 -> r[j + 1] + s;
                case 6 -> r[j + 1] + r[j] + s;
                case 7 -> r[j + 1] + r[j] + r[j] + s;
                case 8 -> r[j + 1] + r[j] + r[j] + r[j] + s;
                case 9 -> r[j] + r[j + 2] + s;
                default -> "";
            };
            j = j + 2;
            n = n / 10;
        }
        return s;
    }

    public static int fromRoman(String s) {
        String[] r = {"IV", "IX", "XL", "XC", "CD", "CM"};
        for (String i : r) {
            switch (i) {
                case "IV" -> s.replace(i, "IIII");
                case "IX" -> s.replace(i, "VIIII");
                case "XL" -> s.replace(i, "XXXX");
                case "XC" -> s.replace(i, "LXXXX");
                case "CD" -> s.replace(i, "CCCC");
                case "CM" -> s.replace(i, "DCCCC");
                default -> s.replace(i, "Null");
            }
        }
        char[] c = s.toCharArray();
        int n = 0;
        for (int i : c) {
            switch (i) {
                case 'I' -> n++;
                case 'V' -> n += 5;
                case 'X' -> n += 10;
                case 'L' -> n += 50;
                case 'C' -> n += 100;
                case 'D' -> n += 500;
                case 'M' -> n += 1000;
                default -> n = 1;
            }
        }
        return n;
    }
}