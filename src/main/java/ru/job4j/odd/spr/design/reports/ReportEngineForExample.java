package ru.job4j.odd.spr.design.reports;

import ru.job4j.odd.spr.design.model.Employee;
import ru.job4j.odd.spr.design.Report;
import ru.job4j.odd.spr.design.store.Store;

import java.util.function.Predicate;

public class ReportEngineForExample implements Report {

    private final Store store;

    public ReportEngineForExample(Store store) {
        this.store = store;
    }

    @Override
    public String generate(Predicate<Employee> filter) {
        StringBuilder text = new StringBuilder();
        String line = System.lineSeparator();
        text.append("Name; Hired; Fired; Salary;");
        for (Employee employee : store.findBy(filter)) {
            text
                    .append(line)
                    .append(employee.getName())
                    .append(";")
                    .append(employee.getHired()).append(";")
                    .append(employee.getFired()).append(";")
                    .append(employee.getSalary()).append(";")
                    .append(System.lineSeparator());
        }
        return text.toString();
    }
}