package ru.job4j.solid.dip.violationoftheprincipledip;

import java.sql.Connection;

/**
 * Нарушение: class "WealthViolationDIPTwo" имеет от конкретной реализации подключения к БД;
 * Решение: использовать интерфейсы для различных реалиазции и уже от них имплементироваться.
 */

public class WealthViolationDIPTwo {
    private Connection connection;

    public void getDBConnection(Connection connection) {
        this.connection = connection;
    }
}
