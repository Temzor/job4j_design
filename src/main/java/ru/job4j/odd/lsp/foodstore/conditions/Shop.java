package ru.job4j.odd.lsp.foodstore.conditions;

import ru.job4j.odd.lsp.foodstore.model.Food;
import ru.job4j.odd.lsp.foodstore.store.Store;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Shop implements Store {

    private Predicate<Food> filter = f -> getFreshPercent(f) <= 75 && getFreshPercent(f) > 0;
    
    private List<Food> foods = new ArrayList<>();
    
    @Override
    public boolean add(Food food) {
        if (food == null) {
            throw new IllegalArgumentException("Object is NULL");
        }
        boolean result = filter.test(food);
        if (result) {
            if (getFreshPercent(food) < 25) {
                food.setDiscount(75);
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
}
