package ru.codewars.sevenkyu;

public class BattleOfTheCharacters {
    public static String battle(final String x, final String y) {
        int xs = x.chars().map(i -> i - 64).sum(), ys = y.chars().map((i -> i - 64)).sum();
        return xs > ys ? x : xs < ys ? y : "Tie!";
    }
}

