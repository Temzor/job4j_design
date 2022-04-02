package ru.job4j.odd.spr.design.reports;

import ru.job4j.odd.spr.design.Report;
import ru.job4j.odd.spr.design.model.Employee;
import ru.job4j.odd.spr.design.store.Store;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.function.Predicate;

public class XMLReport implements Report {

    private final Store store;

    public XMLReport(Store store) {
        this.store = store;
    }

    @Override
    public String generate(Predicate<Employee> filter) {
        EmployeeList employees = new EmployeeList(store.findBy(filter));
        String xml = "";
        try (StringWriter writer = new StringWriter()) {
            JAXBContext context = JAXBContext.newInstance(EmployeeList.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(employees, writer);
            xml = writer.getBuffer().toString();
        } catch (IOException | JAXBException e) {
            e.printStackTrace();
        }
        return xml;
    }

    @XmlRootElement(name = "employees")
    private static class EmployeeList {
        @XmlElement(name = "employee")
        List<Employee> employees;

        public EmployeeList() {
        }

        public EmployeeList(List<Employee> employees) {
            this.employees = employees;
        }
    }
}