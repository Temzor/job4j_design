package ru.job4j.codewars;

public class Greeter {
    public static String greet(String name) {
        return name.equals("Johnny") ? "Hello, my love!"
                : "Hello, " + name + "!";
    }
}

