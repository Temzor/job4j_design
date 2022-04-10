package ru.job4j.solid.spr;

/**
 * Класс Car предоставляет информацию по автомобилям (модель, страна производства, сколрость);
 * carSpeedInHour не использует завсимости.
 */

public class Car {
    private final String model;
    private final String country;
    private final int speed;

    public Car(String model, String country, int speed) {
        this.model = model;
        this.country = country;
        this.speed = speed;
    }

    public void carSpeedInHour(int speed) {
        int time = speed / 60;
    }
}
