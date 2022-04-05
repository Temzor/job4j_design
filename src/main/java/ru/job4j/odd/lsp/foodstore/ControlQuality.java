package ru.job4j.odd.lsp.foodstore;

import ru.job4j.odd.lsp.foodstore.model.Food;
import ru.job4j.odd.lsp.foodstore.store.Store;

import java.util.List;

public class ControlQuality {
    public void sort(List<Store> stores, List<Food> foods) {
        for (Store store : stores) {
            foods.stream().filter(store.filter()).forEach(store::add);
        }
    }
}
