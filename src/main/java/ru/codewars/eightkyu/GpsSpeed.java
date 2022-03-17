package ru.codewars.eightkyu;

public class GpsSpeed {
    public static int gps(int s, double[] x) {
        double topSpeed = 0;
        for (int i = 1; i < x.length; i++) {
            topSpeed = Math.max(3600 * (x[i] - x[i - 1]) / s, topSpeed);
        }
        return (int) topSpeed;
    }
}
