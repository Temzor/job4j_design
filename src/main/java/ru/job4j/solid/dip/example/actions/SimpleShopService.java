package ru.job4j.solid.dip.example.actions;

import ru.job4j.solid.dip.example.Order;
import ru.job4j.solid.dip.example.model.Check;
import ru.job4j.solid.dip.example.model.Product;
import ru.job4j.solid.dip.example.model.User;
import ru.job4j.solid.dip.example.storage.ShopStore;

import java.util.Optional;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SimpleShopService {
    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleShopService.class.getName());
    private ShopStore shopStore;

    public SimpleShopService(ShopStore shopStore) {
        this.shopStore = shopStore;
    }

    public boolean createBucket(User user) {
        if (shopStore.getUsers().isEmpty()) {
            return false;
        }
        return shopStore.saveUser(user);
    }

    public boolean createOrder(User user, Order order) {
        if (shopStore.getOrders(user).isEmpty()) {
            return false;
        }
        return shopStore.saveOrder(user, order);
    }

    public boolean addProduct(User user, Order order, Product product) {
        Optional<Order> orderDB = findOrder(user, order);
        if (orderDB.isEmpty()) {
            return false;
        }
        return orderDB.get().add(product);
    }

    private Optional<Order> findOrder(User user, Order order) {
        return shopStore.getOrders(user).stream()
                .filter(o -> o.getId() == order.getId())
                .findFirst();
    }

    public boolean removeProduct(User user, Order order, Product product) {
        Optional<Order> orderDB = findOrder(user, order);
        if (orderDB.isEmpty()) {
            return false;
        }
        return orderDB.get().remove(product.getId());
    }

    public boolean removeOrder(User user, Order order) {
        Set<Order> orders = shopStore.getOrders(user);
        if (orders == null) {
            return false;
        }
        return orders.remove(order);
    }

    public Check payOrder(User user, Order order) {
        Optional<Order> orderDB = findOrder(user, order);
        if (orderDB.isEmpty()) {
            LOGGER.error("Get error with {} {}", user, order);
            LOGGER.error("{}", new IllegalArgumentException("Invalid order"));
        }
        if (orderDB.get().isPayed()) {
            LOGGER.error("Get error with {} {}", user, order);
            LOGGER.error("{}", new IllegalArgumentException("Already payed!"));
        }
        orderDB.get().setPayed(true);
        return new Check((int) (System.currentTimeMillis() % 1000_000), "Payed: " + orderDB.get().getId());
    }
}