package ru.job4j.codewars;

public class AgeDiff {
    public static String calculateAge(int birth, int yearTo) {
       final int age = yearTo - birth;
        return age == 0 ? "You were born this very year!" : age > 0 ? String.format("You are %d year%s old.", age, age == 1 ? "" : "s") : String.format("You will be born in %d year%s.", -age, -age == 1 ? "" : "s");
    }
}
