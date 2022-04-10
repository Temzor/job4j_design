package ru.job4j.solid.spr.design.reports;

import ru.job4j.solid.spr.design.Report;
import ru.job4j.solid.spr.design.model.Employee;
import ru.job4j.solid.spr.design.store.Store;

import java.util.function.Predicate;

public class ReportEngineForIT implements Report {

    private final Store store;

    public ReportEngineForIT(Store store) {
        this.store = store;
    }

    @Override
    public String generate(Predicate<Employee> filter) {
        StringBuilder text = new StringBuilder();
        String line = System.lineSeparator();
        text
                .append("<!DOCTYPE HTML>\r\n")
                .append("<html> lang=\"en\"")
                .append(line)
                .append("<head>")
                .append(line)
                .append("<title>База данных сотрудников компании</title>")
                .append(line)
                .append("</head>")
                .append(line)
                .append("<body>")
                .append(line)
                .append("<table style=\"width:100%\">")
                .append(line)
                .append("<tr><th>Name</td><td>Hired</th><th>Fired</th><th>Salary</th></tr>")
                .append(line);

        for (Employee employee : store.findBy(filter)) {
            text
                    .append("<tr><td>")
                    .append(employee.getName()).append("</td><td>")
                    .append(employee.getHired()).append("</td><td>")
                    .append(employee.getFired()).append("</td><td>")
                    .append(employee.getSalary()).append("</td></tr>")
                    .append(System.lineSeparator());
        }
        text
                .append("</table>")
                .append(line)
                .append("</body>")
                .append(line)
                .append("</html>");
        return text.toString();
    }
}