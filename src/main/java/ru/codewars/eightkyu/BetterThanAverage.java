package ru.codewars.eightkyu;


import java.util.Arrays;

public class BetterThanAverage {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }
}
