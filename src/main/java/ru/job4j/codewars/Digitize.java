package ru.job4j.codewars;


import java.util.Arrays;

public class Digitize {
    public static int[] digitize(long n) {
        return new StringBuilder(String.valueOf(n))
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
