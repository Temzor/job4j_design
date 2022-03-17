package ru.codewars.eightkyu;

public class BuildString {
    public static String buildString(String... args) {
        return "I like " + String.join(", ", args) + "!";
    }
}
