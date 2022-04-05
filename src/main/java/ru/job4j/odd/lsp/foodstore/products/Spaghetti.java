package ru.job4j.odd.lsp.foodstore.products;

import ru.job4j.odd.lsp.foodstore.model.Food;

import java.sql.Timestamp;
import java.time.LocalDate;

public class Spaghetti extends Food {
    public Spaghetti(String name, LocalDate createDate, LocalDate expiryDate, double price, int discount) {
        super(name, expiryDate, createDate, price, discount);
    }
}
