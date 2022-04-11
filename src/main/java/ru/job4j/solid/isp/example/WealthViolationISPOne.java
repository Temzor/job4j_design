package ru.job4j.solid.isp.example;

/**
 * Интерфейс WealthViolationOCPOne описывает поведение автомобиля;
 * Нарушение: у имплементированного класса с ДВЗ нет заряда (charge()), а у электроавтомобиля нет бака для топлива (tankSize());
 * Решение: разделить интерфейсы на 3 отдельных интерфейса (speed(), tankSize(), charge()), и уже от них имплементировать нужные нам классы.
 */

interface WealthViolationISPOne {
    double speed();
    double tankSize();
    double charge();
}

class ICECar implements  WealthViolationISPOne {

    @Override
    public double speed() {
        return 0;
    }

    @Override
    public double tankSize() {
        return 0;
    }

    @Override
    public double charge() {
        return 0;
    }
}

class ElectricCar implements  WealthViolationISPOne {

    @Override
    public double speed() {
        return 0;
    }

    @Override
    public double tankSize() {
        return 0;
    }

    @Override
    public double charge() {
        return 0;
    }
}