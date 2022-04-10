package ru.job4j.odd.lsp.parking;

import org.junit.Test;
import static org.junit.Assert.*;

import ru.job4j.solid.lsp.parking.GoToParking;
import ru.job4j.solid.lsp.parking.model.Car;
import ru.job4j.solid.lsp.parking.model.Transport;
import ru.job4j.solid.lsp.parking.model.Truck;
import ru.job4j.solid.lsp.parking.store.Parking;

public class GoToParkingTest {

    @Test
    public void whenGoParkingTest() {
        Parking parking = new GoToParking(4, 2);
        Transport car1 = new Car("У312МВ178");
        Transport car2 = new Car("У312МВ178");
        Transport car3 = new Car("Х812ГД103");
        Transport car4 = new Car("В019КЗ777");
        Transport car5 = new Car("П919МТ812");
        Transport truck1 = new Truck("Б963ЛО178", 2);
        Transport truck2 = new Truck("Б963ЛО178", 2);
        Transport truck3 = new Truck("С158ШД95", 2);
        assertTrue(parking.park(car1));
        assertTrue(parking.park(car2));
        assertTrue(parking.park(car3));
        assertTrue(parking.park(car4));
        assertFalse(parking.park(car5));
        assertTrue(parking.park(truck1));
        assertTrue(parking.park(truck2));
        assertFalse(parking.park(truck3));
    }

    @Test
    public void whenGoParkingGoOnlyCarTest() {
        Parking parking = new GoToParking(2, 2);
        Transport car1 = new Car("У312МВ178");
        Transport car2 = new Car("У312МВ178");
        Transport car3 = new Car("Х812ГД103");
        Transport car4 = new Car("В019КЗ777");
        Transport car5 = new Car("П919МТ812");
        assertTrue(parking.park(car1));
        assertTrue(parking.park(car2));
        assertFalse(parking.park(car3));
        assertFalse(parking.park(car4));
        assertFalse(parking.park(car5));
    }

    @Test
    public void whenGoParkingGoOnlyTruckTest() {
        Parking parking = new GoToParking(4, 2);
        Transport truck1 = new Truck("Б963ЛО178", 2);
        Transport truck2 = new Truck("Б963ЛО178", 2);
        Transport truck3 = new Truck("С158ШД95", 2);
        Transport truck4 = new Truck("С158ШД95", 2);
        Transport truck5 = new Truck("С158ШД95", 2);
        assertTrue(parking.park(truck1));
        assertTrue(parking.park(truck2));
        assertTrue(parking.park(truck3));
        assertTrue(parking.park(truck4));
        assertFalse(parking.park(truck5));
    }

    @Test
    public void whenGoParkingTruckOnPlaceForCar() {
        Parking parking = new GoToParking(0, 2);
        Transport car = new Car("У312МВ178");
        assertFalse(parking.park(car));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenTruckTruckSizeLessThen2() {
        Transport truck = new Truck("Б963ЛО178", 1);
    }

}