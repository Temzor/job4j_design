package ru.codewars.eightkyu;

public class Evaporator {
    public static int evaporator(double content, double evapPerDay, double threshold) {
        int result = 0;
        final double constanta = content;
        while (content > constanta * threshold / 100) {
            content -= content * evapPerDay / 100;
            result++;
        }
        return result;
    }
}
