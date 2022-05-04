package ru.job4j.solid.lsp.foodstore;

import ru.job4j.solid.lsp.foodstore.model.Food;
import ru.job4j.solid.lsp.foodstore.store.Store;

import java.util.ArrayList;
import java.util.List;

public class ControlQuality {
    public void sort(List<Store> stores, List<Food> foods) {
        for (Store store : stores) {
            foods.stream().filter(store.filter()).forEach(store::add);
        }
    }

    public void resort(List<Store> stores) {
        List<Food> temp = new ArrayList<>();
        stores.forEach(s -> {
            temp.addAll(s.getAll());
            s.getAll().clear();
        });
        for (Store store : stores) {
            temp.stream().filter(store.filter()).forEach(store::add);
        }
    }
}
