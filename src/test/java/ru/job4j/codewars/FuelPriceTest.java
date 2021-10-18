package ru.job4j.codewars;

import codewars.FuelPrice;
import org.junit.Test;

import static org.junit.Assert.*;

public class FuelPriceTest {
    @Test
    public void exampleTests() {
        assertEquals(5.65d, FuelPrice.fuelPrice(5, 1.23d), 0.001d);
        assertEquals(18.40d, FuelPrice.fuelPrice(8, 2.5d), 0.001d);
        assertEquals(27.50d, FuelPrice.fuelPrice(5, 5.6d),  0.001d);
    }

}