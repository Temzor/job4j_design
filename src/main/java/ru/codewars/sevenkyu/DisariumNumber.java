package ru.codewars.sevenkyu;

public class DisariumNumber {
    public static String disariumNumber(int number) {
        int result = 0;
        String[] array = String.valueOf(number).split("");
        for (int i = 0; i < array.length; i++) {
            result += Math.pow(Integer.parseInt(array[i]), i + 1);
        }
        return number == result ? "Disarium !!" : "Not !!";
    }
}
