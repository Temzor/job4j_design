package ru.codewars.eightkyu;

public class ChromosomeCheck {
    public static String chromosomeCheck(String sperm) {
        return  sperm.equals("XY") ? "Congratulations! You're going to have a son." : "Congratulations! You're going to have a daughter.";
    }
}
