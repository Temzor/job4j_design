package ru.job4j.solid.dip.example.storage;

import ru.job4j.solid.dip.example.Order;
import ru.job4j.solid.dip.example.model.User;

import java.util.Set;

public interface ShopStore {

    boolean saveUser(User user);
    boolean saveOrder(User user, Order order);
    Set<Order> getOrders(User user);
    Set<User> getUsers();

}