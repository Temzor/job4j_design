package ru.job4j.codewars;

import java.util.*;

public class Order {
    public static String order(String words) {
        System.out.println(8 & 16);
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get();
    }
}
