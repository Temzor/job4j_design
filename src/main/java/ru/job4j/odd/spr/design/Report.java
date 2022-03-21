package ru.job4j.odd.spr.design;

import java.util.function.Predicate;

public interface Report {
    String generate(Predicate<Employee> filter);
}
