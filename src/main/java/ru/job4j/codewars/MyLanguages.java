package ru.job4j.codewars;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyLanguages {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        return results
                .entrySet()
                .stream()
                .filter(x -> x.getValue() >= 60)
                .sorted(((o1, o2) -> o2.getValue().compareTo(o1.getValue())))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
