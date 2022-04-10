package ru.job4j.solid.spr.design.reports;

import ru.job4j.solid.spr.design.model.Employee;
import ru.job4j.solid.spr.design.Report;
import ru.job4j.solid.spr.design.store.Store;

import java.util.List;
import java.util.function.Predicate;

public class ReportEngineForHR implements Report {

    private final Store store;

    public ReportEngineForHR(Store store) {
        this.store = store;
    }

    @Override
    public String generate(Predicate<Employee> filter) {
        StringBuilder text = new StringBuilder();
        String line = System.lineSeparator();
        text
                .append("Name; Salary")
                .append(line);
        List<Employee> employees = store.findBy(filter);
        employees.sort((o1, o2) -> Double.compare(o2.getSalary(), o1.getSalary()));
        for (Employee employee : employees) {
            text
                    .append(employee.getName()).append(";")
                    .append(employee.getSalary()).append(";")
                    .append(line);
        }
        return text.toString();
    }
}