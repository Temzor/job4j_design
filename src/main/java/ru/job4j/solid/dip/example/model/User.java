package ru.job4j.solid.dip.example.model;

import ru.job4j.solid.dip.example.BaseEntity;

public class User extends BaseEntity {
    public User(int id, String name) {
        super(id, name);
    }
}
