package ru.job4j.odd.lsp.foodstore;

import org.junit.Test;
import ru.job4j.odd.lsp.foodstore.conditions.Shop;
import ru.job4j.odd.lsp.foodstore.conditions.Trash;
import ru.job4j.odd.lsp.foodstore.conditions.Warehouse;
import ru.job4j.odd.lsp.foodstore.model.Food;
import ru.job4j.odd.lsp.foodstore.products.Bread;
import ru.job4j.odd.lsp.foodstore.products.Milk;
import ru.job4j.odd.lsp.foodstore.products.Spaghetti;
import ru.job4j.odd.lsp.foodstore.store.Store;

import java.time.LocalDate;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class ControlQualityTest {
    @Test
    public void whenBreadGoToWarehouse() {
        Store warehouse = new Warehouse(f -> f.isFreshInPercent() > 75);
        Store shop = new Shop(f -> f.isFreshInPercent() <= 75 && f.isFreshInPercent() > 0);
        Store trash = new Trash(f -> f.isFreshInPercent() <= 0);
        List<Store> stores = List.of(warehouse, shop, trash);
        Food bread = new Bread("Bread",
                LocalDate.of(2022, 4, 4),
                LocalDate.of(2022, 4, 9),
                68.8, 0);
        List<Food> foods = List.of(bread);
        ControlQuality controlQuality = new ControlQuality();
        controlQuality.sort(stores, foods);
        assertThat(warehouse.getAll(), is(foods));
    }

    @Test
    public void whenMilkGoToUtil() {
        Store warehouse = new Warehouse(f -> f.isFreshInPercent() > 75);
        Store shop = new Shop(f -> f.isFreshInPercent() <= 75 && f.isFreshInPercent() > 0);
        Store trash = new Trash(f -> f.isFreshInPercent() <= 0);
        List<Store> stores = List.of(warehouse, shop, trash);
        Food milk = new Milk("Milk",
                LocalDate.of(2022, 4, 1),
                LocalDate.of(2022, 4, 5),
                68.8, 0);
        List<Food> foods = List.of(milk);
        ControlQuality controlQuality = new ControlQuality();
        controlQuality.sort(stores, foods);
        assertThat(trash.getAll(), is(foods));
    }

    @Test
    public void whenMilkGoToShop() {
        Store warehouse = new Warehouse(f -> f.isFreshInPercent() > 75);
        Store shop = new Shop(f -> f.isFreshInPercent() <= 75 && f.isFreshInPercent() > 0);
        Store trash = new Trash(f -> f.isFreshInPercent() <= 0);
        List<Store> stores = List.of(warehouse, shop, trash);
        Food milk = new Milk("Milk",
                LocalDate.of(2022, 4, 1),
                LocalDate.of(2022, 4, 16),
                68.8, 0);
        List<Food> foods = List.of(milk);
        ControlQuality controlQuality = new ControlQuality();
        controlQuality.sort(stores, foods);
        assertThat(shop.getAll(), is(foods));
    }

    @Test
    public void whenExpiryDateLessThen25AndSetDiscount() {
        Store warehouse = new Warehouse(f -> f.isFreshInPercent() > 75);
        Store shop = new Shop(f -> f.isFreshInPercent() <= 75 && f.isFreshInPercent() > 0);
        Store trash = new Trash(f -> f.isFreshInPercent() <= 0);
        List<Store> stores = List.of(warehouse, shop, trash);
        Food spaghetti = new Spaghetti("Spaghetti",
                LocalDate.of(2022, 4, 1),
                LocalDate.of(2022, 4, 15),
                400, 50);
        List<Food> foods = List.of(spaghetti);
        ControlQuality controlQuality = new ControlQuality();
        controlQuality.sort(stores, foods);
        assertThat(shop.getAll(), is(foods));
        assertThat(spaghetti.getDiscount(), is(50));
    }

    @Test
    public void whenMultiProductsToSort() {
        Store warehouse = new Warehouse(f -> f.isFreshInPercent() > 75);
        Store shop = new Shop(f -> f.isFreshInPercent() <= 75 && f.isFreshInPercent() > 0);
        Store trash = new Trash(f -> f.isFreshInPercent() <= 0);
        List<Store> stores = List.of(warehouse, shop, trash);
        Food milk = new Milk("Milk",
                LocalDate.of(2022, 4, 1),
                LocalDate.of(2022, 4, 5),
                68.8, 0);
        Food spaghetti = new Spaghetti("Spaghetti",
                LocalDate.of(2022, 4, 1),
                LocalDate.of(2022, 4, 15),
                400, 0);
        Food bread = new Bread("Bread",
                LocalDate.of(2022, 4, 4),
                LocalDate.of(2022, 4, 9),
                30.80, 0);
        List<Food> foods = List.of(milk, spaghetti, bread);
        ControlQuality controlQuality = new ControlQuality();
        controlQuality.sort(stores, foods);
        assertThat(trash.getAll(), is(List.of(milk)));
        assertThat(shop.getAll(), is(List.of(spaghetti)));
        assertThat(warehouse.getAll(), is(List.of(bread)));
    }
}