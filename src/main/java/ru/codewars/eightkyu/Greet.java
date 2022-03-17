package ru.codewars.eightkyu;

public class Greet {
    public static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}
