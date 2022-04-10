package ru.job4j.odd.lsp.parking;

import static org.hamcrest.Matchers.*;
import org.hamcrest.MatcherAssert;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

import ru.job4j.solid.lsp.parking.MainParking;
import ru.job4j.solid.lsp.parking.model.Car;
import ru.job4j.solid.lsp.parking.model.Transport;
import ru.job4j.solid.lsp.parking.model.Truck;
import ru.job4j.solid.lsp.parking.store.GoToParking;
import ru.job4j.solid.lsp.parking.store.Parking;

public class MainParkingTest {

    @Ignore
    @Test
    public void whenCarParkTrue() {
        Parking parking = new GoToParking(30, 10);
        MainParking mainParking = new MainParking(parking);
        Transport car = new Car("У312МВ178");
        assertTrue(mainParking.park(car));
        MatcherAssert.assertThat(parking.getTransport("У312МВ178"), is(car));
    }

    @Ignore
    @Test
    public void whenTruckParkTrue() {
        Parking parking = new GoToParking(30, 10);
        MainParking mainParking = new MainParking(parking);
        Transport truck = new Truck("Б963ЛО178", 2);
        assertTrue(mainParking.park(truck));
        MatcherAssert.assertThat(parking.getTransport("У312МВ178"), is(truck));
    }

    @Ignore
    @Test
    public void whenCarParkFalse() {
        Parking parking = new GoToParking(30, 30);
        MainParking mainParking = new MainParking(parking);
        Transport car = new Car("У312МВ178");
        assertFalse(mainParking.park(car));
        MatcherAssert.assertThat(parking.getTransport("У312МВ178"), is(nullValue()));
    }

    @Ignore
    @Test
    public void whenTruckParkFalse() {
        Parking parking = new GoToParking(30, 29);
        MainParking mainParking = new MainParking(parking);
        Transport truck = new Truck("Б963ЛО178", 2);
        assertFalse(mainParking.park(truck));
        MatcherAssert.assertThat(parking.getTransport("Б963ЛО178"), is(nullValue()));
    }

    @Ignore
    @Test
    public void whenTruckUnParkAndCarParkTrue() {
        Parking parking = new GoToParking(30, 30);
        MainParking mainParking = new MainParking(parking);
        Transport truck = new Truck("Б963ЛО178", 2);
        Transport car = new Car("У312МВ178");
        mainParking.unPark(truck);
        assertTrue(mainParking.park(car));
        MatcherAssert.assertThat(parking.getTransport("У312МВ178"), is(car));
    }

    @Ignore
    @Test
    public void whenCarUnParkAndTrackParkTrue() {
        Parking parking = new GoToParking(30, 30);
        MainParking mainParking = new MainParking(parking);
        Transport truck = new Truck("Б963ЛО178", 2);
        Transport car1 = new Car("У312МВ178");
        Transport car2 = new Car("Р487ЩЗ178");
        mainParking.unPark(car1);
        mainParking.unPark(car2);
        assertTrue(mainParking.park(truck));
        MatcherAssert.assertThat(parking.getTransport("Б963ЛО178"), is("Б963ЛО178"));
    }

    @Ignore
    @Test
    public void whenTruckUnParkAndThreeCarPark() {
        Parking parking = new GoToParking(30, 30);
        MainParking mainParking = new MainParking(parking);
        Transport truck = new Truck("Б963ЛО178", 2);
        Transport car1 = new Car("У312МВ178");
        Transport car2 = new Car("Р487ЩЗ178");
        Transport car3 = new Car("З198МК198");
        mainParking.unPark(truck);
        assertTrue(mainParking.park(car1));
        assertTrue(mainParking.park(car2));
        assertFalse(mainParking.park(car3));
        MatcherAssert.assertThat(parking.getTransport("Б963ЛО178"), is("Б963ЛО178"));
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