package ru.job4j.solid.lsp.foodstore.store;

import ru.job4j.solid.lsp.foodstore.model.Food;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public interface Store {
    boolean add(Food food);

    Predicate<Food> filter();

    List<Food> getAll();

    void clear();

    default long getFreshPercent(Food food) {
        if (food == null) {
            throw new IllegalArgumentException("Object is NULL");
        }
        long shelfLife = food.getCreateDate().until(food.getExpiryDate(), ChronoUnit.DAYS);
        long daysUntilExpiry = LocalDate.now().until(food.getExpiryDate(), ChronoUnit.DAYS);
        double percent = (double) daysUntilExpiry / shelfLife * 100;
        return (long) percent;
    }
}
