package ru.codewars.sevenkyu;

public class SpecialNumber {
    public static String specialNumber(int number) {
        boolean out = true;
        String[] result = String.valueOf(number).replace("^[0-5]", "O").split("");

        for (String s : result) {
            if (s.contains("1") || s.contains("2") || s.contains("3") || s.contains("4") || s.contains("5") || s.contains("0")) {
                continue;
            } else {
                out = false;
                break;
            }
        }

        return out ? "Special!!" : "NOT!!";
    }
}
