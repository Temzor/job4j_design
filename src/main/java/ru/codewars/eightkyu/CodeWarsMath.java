package ru.codewars.eightkyu;

public class CodeWarsMath {
    public static int nearestSq(final int n) {
        return (int) Math.pow(Math.round(Math.sqrt(n)), 2);
    }
}