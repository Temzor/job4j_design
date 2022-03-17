package ru.codewars.eightkyu;

public class GreetMe {
    public static String greet(String name) {
        return "Hello " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + "!";
    }
}
