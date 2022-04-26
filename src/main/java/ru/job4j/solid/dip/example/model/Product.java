package ru.job4j.solid.dip.example.model;

import ru.job4j.solid.dip.example.BaseEntity;

public class Product extends BaseEntity {
    public Product(int id, String name) {
        super(id, name);
    }
}