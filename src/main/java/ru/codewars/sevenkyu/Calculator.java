package ru.codewars.sevenkyu;

import java.lang.constant.Constable;

public class Calculator {
    public static Double calculate(final double x, final String op, final double y) {
        return switch (op) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y + 0.0;
            case "/" -> y == 0 ? null : x / y;
            default -> null;
        };
    }
}