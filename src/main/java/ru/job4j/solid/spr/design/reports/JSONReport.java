package ru.job4j.solid.spr.design.reports;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.job4j.solid.spr.design.Report;
import ru.job4j.solid.spr.design.model.Employee;
import ru.job4j.solid.spr.design.store.Store;

import java.util.function.Predicate;

public class JSONReport implements Report {

    private final Store store;

    public JSONReport(Store store) {
        this.store = store;
    }

    @Override
    public String generate(Predicate<Employee> filter) {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(store.findBy(filter));
    }
}
