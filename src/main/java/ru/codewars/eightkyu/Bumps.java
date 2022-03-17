package ru.codewars.eightkyu;

public class Bumps {
    public static String bumps(final String road) {
        return road.chars().filter(ch -> ch == 'n').count() > 15 ? "Car Dead" : "Woohoo!";
    }
}