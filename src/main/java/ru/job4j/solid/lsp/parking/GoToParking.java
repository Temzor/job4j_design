package ru.job4j.solid.lsp.parking;

import ru.job4j.solid.lsp.parking.model.Car;
import ru.job4j.solid.lsp.parking.model.Transport;
import ru.job4j.solid.lsp.parking.store.Parking;

import java.util.ArrayList;
import java.util.List;

public class GoToParking implements Parking {
    private final List<Transport> cars;
    private final List<Transport> trucks;
    private int freePlacesForCar;
    private int freePlacesForTruck;

    public GoToParking(int freePlacesForCar, int freePlacesForTruck) {
        this.freePlacesForCar = freePlacesForCar;
        this.freePlacesForTruck = freePlacesForTruck;
        this.cars = new ArrayList<>(freePlacesForCar);
        this.trucks = new ArrayList<>(freePlacesForTruck);
    }

    @Override
    public boolean park(Transport transport) {
        boolean result = false;
        if (transport.getSizeTransport() > Car.SIZE && freePlacesForTruck > 0) {
            trucks.add(transport);
            this.freePlacesForTruck--;
            result = true;
        } else if (transport.getSizeTransport() > Car.SIZE && freePlacesForCar >= transport.getSizeTransport()) {
            for (int i = 0; i < transport.getSizeTransport(); i++) {
                cars.add(transport);
                this.freePlacesForCar--;
                result = true;
            }
        } else if (transport.getSizeTransport() == Car.SIZE && freePlacesForCar >= 1) {
            cars.add(transport);
            this.freePlacesForCar--;
            result = true;
        }
        return result;
    }
}
