package ru.job4j.solid.spr.design;

import ru.job4j.solid.spr.design.model.Employee;

import java.util.function.Predicate;

public interface Report {
    String generate(Predicate<Employee> filter);
}