package ru.job4j.odd.lsp.parking;

import static org.hamcrest.Matchers.*;
import org.hamcrest.MatcherAssert;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import ru.job4j.odd.lsp.parking.model.Car;
import ru.job4j.odd.lsp.parking.model.Transport;
import ru.job4j.odd.lsp.parking.model.Truck;
import ru.job4j.odd.lsp.parking.store.Parking;

public class GoToParkingTest {

    @Ignore
    @Test
    public void whenGoParkingTest() {
        Parking parking = new GoToParking(4, 2);
        Transport car = new Car("У312МВ178");
        Transport truck = new Truck("Б963ЛО178", 2);
        Transport truck2 = new Truck("Б963ЛО178", 3);
        Transport car1 = new Car("У312МВ178");
        assertTrue(parking.park(car));
        assertTrue(parking.park(truck));
        assertTrue(parking.park(car1));
        assertTrue(parking.park(truck2));
        assertTrue(parking.park(car1));
        assertFalse(parking.park(truck2));
        assertTrue(parking.park(truck));
        assertFalse(parking.park(car));
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void whenTruckSpaceGreaterThenCapacity() {
        Parking parking = new GoToParking(4, 5);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void whenTruckTruckSizeLessThen2() {
        Transport truck = new Truck("Б963ЛО178", 1);
    }

}