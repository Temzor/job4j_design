package ru.codewars.eightkyu;

public class ZywOo3 {
    public static boolean validateUsr(String s) {
        return s.matches("[a-z_\\d]{4,16}");
    }
}
