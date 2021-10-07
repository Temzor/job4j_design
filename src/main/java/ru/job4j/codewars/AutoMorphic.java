package ru.job4j.codewars;

public class AutoMorphic {
    public static String autoMorphic(int number) {
        final int squared = (int) Math.sqrt(number);
        return  (number * number) % Math.pow(10, String.valueOf(number).length()) == number ? "Automorphic" : "Not!!";
    }
}
