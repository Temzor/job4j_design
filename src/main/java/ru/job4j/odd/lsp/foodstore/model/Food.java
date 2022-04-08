package ru.job4j.odd.lsp.foodstore.model;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Food {
    private final String name;
    private final LocalDate createDate;
    private final LocalDate expiryDate;
    private double price;
    private int discount;

    public Food(String name, LocalDate expiryDate, LocalDate createDate,  double price, int discount) {
        this.name = name;
        this.expiryDate = expiryDate;
        this.createDate = createDate;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public double getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
