package ru.job4j.odd.spr.design.templates;

import ru.job4j.odd.spr.design.model.Employee;
import ru.job4j.odd.spr.design.Report;
import ru.job4j.odd.spr.design.store.Store;
import java.util.List;
import java.util.function.Predicate;

public class ReportEngineForHR implements Report {

    private final Store store;
    private int nds = 120 * 20;

    public ReportEngineForHR(Store store) {
        this.store = store;
    }

    @Override
    public String generate(Predicate<Employee> filter) {
        StringBuilder text = new StringBuilder();
        String line = System.lineSeparator();
        List<Employee> employees = store.findBy(filter);
        employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        text.append("Name; Salary").append(System.lineSeparator());
        for (Employee employee : store.findBy(filter)) {
            text.append(employee.getName()).append(";")
                    .append(employee.getSalary()).append(";")
                    .append(line);
        }
        return text.toString();
    }
}