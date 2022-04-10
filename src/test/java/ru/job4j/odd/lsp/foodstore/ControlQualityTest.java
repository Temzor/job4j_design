package ru.job4j.odd.lsp.foodstore;

import org.junit.Test;
import ru.job4j.solid.lsp.foodstore.ControlQuality;
import ru.job4j.solid.lsp.foodstore.conditions.Shop;
import ru.job4j.solid.lsp.foodstore.conditions.Trash;
import ru.job4j.solid.lsp.foodstore.conditions.Warehouse;
import ru.job4j.solid.lsp.foodstore.model.Food;
import ru.job4j.solid.lsp.foodstore.products.Bread;
import ru.job4j.solid.lsp.foodstore.products.Milk;
import ru.job4j.solid.lsp.foodstore.products.Spaghetti;
import ru.job4j.solid.lsp.foodstore.store.Store;
import java.time.LocalDate;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class ControlQualityTest {
    @Test
    public void whenBreadGoToWarehouse() {
        Store warehouse = new Warehouse();
        Store shop = new Shop();
        Store trash = new Trash();
        List<Store> stores = List.of(warehouse, shop, trash);
        Food bread = new Bread("Bread",
                LocalDate.now().minusDays(3),
                LocalDate.now().plusDays(10),
                30.80, 0);
        List<Food> foods = List.of(bread);
        ControlQuality controlQuality = new ControlQuality();
        controlQuality.sort(stores, foods);
        assertThat(warehouse.getAll(), is(foods));
    }

    @Test
    public void whenMilkGoToUtil() {
        Store warehouse = new Warehouse();
        Store shop = new Shop();
        Store trash = new Trash();
        List<Store> stores = List.of(warehouse, shop, trash);
        Food milk = new Milk("Milk",
                LocalDate.now().minusDays(3),
                LocalDate.now().plusDays(0),
                68.8, 0);
        List<Food> foods = List.of(milk);
        ControlQuality controlQuality = new ControlQuality();
        controlQuality.sort(stores, foods);
        assertThat(trash.getAll(), is(foods));
    }

    @Test
    public void whenMilkGoToShop() {
        Store warehouse = new Warehouse();
        Store shop = new Shop();
        Store trash = new Trash();
        List<Store> stores = List.of(warehouse, shop, trash);
        Food milk = new Milk("Milk",
                LocalDate.now().minusDays(3),
                LocalDate.now().plusDays(2),
                68.8, 0);
        List<Food> foods = List.of(milk);
        ControlQuality controlQuality = new ControlQuality();
        controlQuality.sort(stores, foods);
        assertThat(shop.getAll(), is(foods));
    }

    @Test
    public void whenExpiryDateLessThen25AndSetDiscount() {
        Store warehouse = new Warehouse();
        Store shop = new Shop();
        Store trash = new Trash();
        List<Store> stores = List.of(warehouse, shop, trash);
        Food spaghetti = new Spaghetti("Spaghetti",
                LocalDate.now().minusDays(30),
                LocalDate.now().plusDays(5),
                400, 25);
        List<Food> foods = List.of(spaghetti);
        ControlQuality controlQuality = new ControlQuality();
        controlQuality.sort(stores, foods);
        assertThat(shop.getAll(), is(foods));
        assertThat(shop.getAll().get(0).getPrice(), is(300.0));
        assertThat(spaghetti.getDiscount(), is(25));
    }


    @Test
    public void whenExpiryDateLessThen50AndSetDiscount() {
        Store warehouse = new Warehouse();
        Store shop = new Shop();
        Store trash = new Trash();
        List<Store> stores = List.of(warehouse, shop, trash);
        Food spaghetti = new Spaghetti("Spaghetti",
                LocalDate.now().minusDays(30),
                LocalDate.now().plusDays(5),
                400, 50);
        List<Food> foods = List.of(spaghetti);
        ControlQuality controlQuality = new ControlQuality();
        controlQuality.sort(stores, foods);
        assertThat(shop.getAll(), is(foods));
        assertThat(shop.getAll().get(0).getPrice(), is(200.0));
        assertThat(spaghetti.getDiscount(), is(50));
    }

    @Test
    public void whenExpiryDateLessThen75AndSetDiscount() {
        Store warehouse = new Warehouse();
        Store shop = new Shop();
        Store trash = new Trash();
        List<Store> stores = List.of(warehouse, shop, trash);
        Food spaghetti = new Spaghetti("Spaghetti",
                LocalDate.now().minusDays(30),
                LocalDate.now().plusDays(5),
                400, 75);
        List<Food> foods = List.of(spaghetti);
        ControlQuality controlQuality = new ControlQuality();
        controlQuality.sort(stores, foods);
        assertThat(shop.getAll(), is(foods));
        assertThat(shop.getAll().get(0).getPrice(), is(100.0));
        assertThat(spaghetti.getDiscount(), is(75));
    }

    @Test
    public void whenMultiProductsToSort() {
        Store warehouse = new Warehouse();
        Store shop = new Shop();
        Store trash = new Trash();
        List<Store> stores = List.of(warehouse, shop, trash);
        Food milk = new Milk("Milk",
                LocalDate.now().minusDays(3),
                LocalDate.now().plusDays(0),
                68.8, 0);
        Food spaghetti = new Spaghetti("Spaghetti",
                LocalDate.now().minusDays(3),
                LocalDate.now().plusDays(2),
                400, 0);
        Food bread = new Bread("Bread",
                LocalDate.now().minusDays(3),
                LocalDate.now().plusDays(10),
                30.80, 0);
        List<Food> foods = List.of(milk, spaghetti, bread);
        ControlQuality controlQuality = new ControlQuality();
        controlQuality.sort(stores, foods);
        assertThat(trash.getAll(), is(List.of(milk)));
        assertThat(shop.getAll(), is(List.of(spaghetti)));
        assertThat(warehouse.getAll(), is(List.of(bread)));
    }
}