package ru.job4j.odd.lsp.foodstore.store;

import ru.job4j.odd.lsp.foodstore.model.Food;
import java.util.List;
import java.util.function.Predicate;

public interface Store {
    void add(Food food);

    Predicate<Food> filter();

    List<Food> getAll();
}
