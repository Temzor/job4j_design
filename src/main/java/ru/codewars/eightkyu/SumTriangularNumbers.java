package ru.codewars.eightkyu;

public class SumTriangularNumbers {
    public static int sumTriangularNumbers(int n) {
            if (n <= 0) {
                return 0;
            }
            return n * (n + 1) * (n + 2) / 6;
        }
    }

