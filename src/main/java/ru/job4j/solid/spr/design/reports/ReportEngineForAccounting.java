package ru.job4j.solid.spr.design.reports;

import ru.job4j.solid.spr.design.model.Employee;
import ru.job4j.solid.spr.design.Report;
import ru.job4j.solid.spr.design.store.Store;

import java.util.function.Predicate;

public class ReportEngineForAccounting implements Report {

    private final Store store;
    private final int nds = 120 * 20;

    public ReportEngineForAccounting(Store store) {
        this.store = store;
    }

    @Override
    public String generate(Predicate<Employee> filter) {
        StringBuilder text = new StringBuilder();
        text.append("Name; Hired; Fired; Salary").append(System.lineSeparator());
        for (Employee employee : store.findBy(filter)) {
            text.append(employee.getName()).append(";")
                    .append(employee.getHired()).append(";")
                    .append(employee.getFired()).append(";")
                    .append(employee.getSalary() - (employee.getSalary() / nds)).append(";")
                    .append(System.lineSeparator());
        }
        return text.toString();
    }
}