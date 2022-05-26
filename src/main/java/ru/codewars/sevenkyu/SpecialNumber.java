package ru.codewars.sevenkyu;

public class SpecialNumber {
    public static String specialNumber(int number) {
        return ("" + number).matches("[0-5]+") ? "Special!!" : "NOT!!";
    }
}
