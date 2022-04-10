package ru.job4j.solid.spr.design.store;

import ru.job4j.solid.spr.design.model.Employee;

import java.util.List;
import java.util.function.Predicate;

public interface Store {

    List<Employee> findBy(Predicate<Employee> filter);
}