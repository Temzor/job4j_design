package ru.codewars.eightkyu;

import java.util.Arrays;

public class SubtractSum {
    public static String subtractSum(int n) {
        String[] words = new String[] {
                "kiwi", "pear", "kiwi", "banana", "melon",
                "banana", "melon", "pineapple", "apple",
                "pineapple", "cucumber", "pineapple",
                "cucumber", "orange", "grape", "orange",
                "grape", "apple", "grape", "cherry", "pear",
                "cherry", "pear", "kiwi", "banana", "kiwi",
                "apple", "melon", "banana", "melon",
                "pineapple", "melon", "pineapple",
                "cucumber", "orange", "apple", "orange",
                "grape", "orange", "grape", "cherry",
                "pear", "cherry", "pear", "apple", "pear",
                "kiwi", "banana", "kiwi", "banana",
                "melon", "pineapple", "melon",
                "apple", "cucumber", "pineapple", "cucumber",
                "orange", "cucumber", "orange", "grape",
                "cherry", "apple", "cherry", "pear", "cherry",
                "pear", "kiwi", "pear", "kiwi", "banana",
                "apple", "banana", "melon", "pineapple",
                "melon", "pineapple", "cucumber", "pineapple",
                "cucumber", "apple", "grape", "orange", "grape",
                "cherry", "grape", "cherry", "pear", "cherry",
                "apple", "kiwi", "banana", "kiwi", "banana", "melon",
                "banana", "melon", "pineapple", "apple", "pineapple"
        };

        do {
            n -= Arrays
                    .stream(String.valueOf(n).split(""))
                    .mapToInt(Integer::parseInt)
                    .sum();
        } while (n > 100);
        return words[n - 1];

        }
}
