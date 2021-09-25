package ru.job4j.codewars;

public class GrassHopper3 {
    public static String weatherInfo(int temp) {
        double c = (temp - 32) * 0.5555555555555556;
        if (c < 0) {
            return (c + " is freezing temperature");
        } else {
            return (c + " is above freezing temperature");
        }
    }
}
