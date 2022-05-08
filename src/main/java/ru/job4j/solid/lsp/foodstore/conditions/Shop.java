package ru.job4j.solid.lsp.foodstore.conditions;

import ru.job4j.solid.lsp.foodstore.model.Food;
import ru.job4j.solid.lsp.foodstore.store.Store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Shop implements Store {

    private final Predicate<Food> filter = f -> getFreshPercent(f) <= 75 && getFreshPercent(f) > 0;
    
    private final List<Food> foods = new ArrayList<>();
    
    @Override
    public boolean add(Food food) {
        if (food == null) {
            throw new IllegalArgumentException("Object is NULL");
        }
        boolean result = filter.test(food);
        if (result) {
            if (getFreshPercent(food) < 25) {
                food.setPrice(food.getPrice() - (food.getPrice() * food.getDiscount() / 100));
            }
            foods.add(food);
        }
        return result;
    }

    @Override
    public Predicate<Food> filter() {
        return filter;
    }

    @Override
    public List<Food> getAll() {
        return List.copyOf(foods);
    }

    @Override
    public void clear() {
        foods.clear();
    }
}
