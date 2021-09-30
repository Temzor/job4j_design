package ru.job4j.codewars;

public class Numbers {
    public static double twoDecimalPlaces(double number) {
       return Math.round(number * 100.0) / 100.0;
    }
}
