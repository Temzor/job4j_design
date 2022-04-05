package ru.job4j.odd.lsp.foodstore.conditions;

import ru.job4j.odd.lsp.foodstore.model.Food;
import ru.job4j.odd.lsp.foodstore.store.Store;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Warehouse implements Store {
    Predicate<Food> filter;

    List<Food> foods = new ArrayList<>();

    public Warehouse(Predicate<Food> filter) {
        this.filter = filter;
    }

    @Override
    public void add(Food food) {
        foods.add(food);
    }

    @Override
    public Predicate<Food> filter() {
        return filter;
    }

    @Override
    public List<Food> getAll() {
        return foods;
    }
}

