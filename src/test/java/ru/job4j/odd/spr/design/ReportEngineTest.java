package ru.job4j.odd.spr.design;

import static org.hamcrest.Matchers.is;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import ru.job4j.odd.spr.design.model.Employee;
import ru.job4j.odd.spr.design.store.MemStore;
import ru.job4j.odd.spr.design.templates.ReportEngineForAccounting;
import ru.job4j.odd.spr.design.templates.ReportEngineForExample;
import ru.job4j.odd.spr.design.templates.ReportEngineForHR;
import ru.job4j.odd.spr.design.templates.ReportEngineForIT;

import java.util.Calendar;


public class ReportEngineTest {

    @Test
    public void whenOldGenerated() {
        MemStore store = new MemStore();
        Calendar now = Calendar.getInstance();
        Employee worker = new Employee("Ivan", now, now, 100);
        store.add(worker);
        Report engine = new ReportEngineForExample(store);
        String expect = "Name; Hired; Fired; Salary;"
                + System.lineSeparator()
                + worker.getName() + ";"
                + worker.getHired() + ";"
                + worker.getFired() + ";"
                + worker.getSalary() + ";"
                + System.lineSeparator();
        MatcherAssert.assertThat(engine.generate(em -> true), is(expect));
    }

    @Test
    public void whenITHTMLGenerated() {
        MemStore store = new MemStore();
        Calendar now = Calendar.getInstance();
        Employee worker = new Employee("Ivan", now, now, 100);
        store.add(worker);
        Report engine = new ReportEngineForIT(store);
        String line = System.lineSeparator();
        StringBuilder expect = new StringBuilder()
                .append("<!DOCTYPE HTML>")
                .append(line)
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
                .append(line)
                .append("<tr><td>")
                .append(worker.getName()).append("</td><td>")
                .append(worker.getHired()).append("</td><td>")
                .append(worker.getFired()).append("</td><td>")
                .append(worker.getSalary()).append("</td></tr>")
                .append(line)
                .append("</table>")
                .append(line)
                .append("</body>")
                .append(line)
                .append("</html>");
        MatcherAssert.assertThat(engine.generate(em -> true), is(expect.toString()));
    }

    @Test
    public void whenSaleForAccountingGenerated() {
        MemStore store = new MemStore();
        Calendar now = Calendar.getInstance();
        Employee worker = new Employee("Ivan", now, now, 100);
        store.add(worker);
        int nds =  120 * 20;
        String line = System.lineSeparator();
        Report engine = new ReportEngineForAccounting(store);
        StringBuilder expect = new StringBuilder()
                .append("Name; Hired; Fired; Salary")
                .append(line)
                .append(worker.getName()).append(";")
                .append(worker.getHired()).append(";")
                .append(worker.getFired()).append(";")
                .append(worker.getSalary() - (worker.getSalary() / nds)).append(";")
                .append(line);
        MatcherAssert.assertThat(engine.generate(em -> true), is(expect.toString()));
    }

    @Test
    public void whenSaleForHRGenerated() {
        MemStore store = new MemStore();
        Calendar now = Calendar.getInstance();
        Employee worker1 = new Employee("Petrov", now, now, 100);
        Employee worker2 = new Employee("Ivanov", now, now, 600);
        Employee worker3 = new Employee("Sidorov", now, now, 500);
        Employee worker4 = new Employee("Kapustin", now, now, 200);
        store.add(worker1);
        store.add(worker2);
        store.add(worker3);
        store.add(worker4);
        String line = System.lineSeparator();
        Report engine = new ReportEngineForHR(store);
        StringBuilder expect = new StringBuilder()
                .append("Name; Salary")
                .append(line)
                .append(worker2.getName()).append(";")
                .append(worker2.getSalary()).append(";")
                .append(line)
                .append(worker3.getName()).append(";")
                .append(worker3.getSalary()).append(";")
                .append(line)
                .append(worker4.getName()).append(";")
                .append(worker4.getSalary()).append(";")
                .append(line)
                .append(worker1.getName()).append(";")
                .append(worker1.getSalary()).append(";")
                .append(line);
        MatcherAssert.assertThat(engine.generate(em -> true), is(expect.toString()));
    }
}