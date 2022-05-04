package ru.job4j.solid.lsp.foodstore.conditions;

import ru.job4j.solid.lsp.foodstore.model.Food;
import ru.job4j.solid.lsp.foodstore.store.Store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Warehouse implements Store {
    private final Predicate<Food> filter = f -> getFreshPercent(f) > 75;

    private final List<Food> foods = new ArrayList<>();

    @Override
    public boolean add(Food food) {
        if (food == null) {
            throw new IllegalArgumentException("Object is NULL");
        }
        boolean rsl = filter.test(food);
        if (rsl) {
            foods.add(food);
        }
        return rsl;
    }

    @Override
    public Predicate<Food> filter() {
        return filter;
    }

    public List<Food> getAll() {
        return List.copyOf(foods);
    }

    @Override
    public Collection<? extends Food> clear() {
        this.foods.clear();
        return null;
    }
}

