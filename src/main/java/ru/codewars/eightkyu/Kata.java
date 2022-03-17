package ru.codewars.eightkyu;

import java.util.function.IntUnaryOperator;

public class Kata {

    public static IntUnaryOperator add(int n) {
        return num -> num + n;
    }

}