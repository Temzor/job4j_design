package ru.job4j.codewars;

public class DescribeAge {
    public static String describeAge(int age) {
        return "You're a(n) " + (age < 13 ? "kid" : age < 18 ? "teenager" : age < 65 ? "adult" : "elderly");
    }
}
