package ru.job4j.codewars;

public class CharProblem {
    public static int howOld(final String herOld) {
        return Character.getNumericValue(herOld.charAt(0));
    }
}
