package ru.codewars.sevenkyu;

import java.lang.constant.Constable;

public class Calculator {
    public static Constable calculate(final double numberOne, final String operation, final double numberTwo) {
        return switch (operation) {
            case ("+") -> numberOne + numberTwo;
            case ("-") -> numberOne - numberTwo;
            case ("*") -> numberOne <= 0 || numberTwo <= 0 ? Math.abs(numberOne * numberTwo) : numberOne * numberTwo;
            case ("/") -> numberOne == 0 || numberTwo == 0 ? null : numberOne / numberTwo;
            default -> null;
        };
    }
}
