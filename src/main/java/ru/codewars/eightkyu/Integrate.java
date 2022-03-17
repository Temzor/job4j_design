package ru.codewars.eightkyu;

public class Integrate {
    public static String integrate(int coefficient, int exponent) {
        return coefficient / (exponent + 1) + "x^" + (exponent + 1);
    }
}
