package ru.codewars.sevenkyu;

public class JumpingNumber {
    public static String jumpingNumber(int number) {
        if (number >= 0 && number <= 9) {
            return "Jumping!!";
        }

        String[] values = String.valueOf(number).split("");

        for (int i = 0; i < values.length - 1; i++) {
            if (Math.abs(Integer.parseInt(values[i]) - Integer.parseInt(values[i + 1])) > 1) {
                return "Not!!";
            }
        }
        return "Jumping!!";
    }
}
