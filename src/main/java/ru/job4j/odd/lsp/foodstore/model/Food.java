package ru.job4j.odd.lsp.foodstore.model;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Food {
    private String name;
    private LocalDate createDate;
    private LocalDate expiryDate;
    double price;
    int discount;

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

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public long isFreshInPercent() {
        long shelfLife = createDate.until(expiryDate, ChronoUnit.DAYS);
        long daysUntilExpiry = LocalDate.now().until(expiryDate, ChronoUnit.DAYS);
        double percent = (double) daysUntilExpiry / shelfLife * 100;
        System.out.println(shelfLife);
        System.out.println(daysUntilExpiry);
        System.out.println(percent);
        return (long) percent;
    }
}