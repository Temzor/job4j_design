package ru.job4j.odd.lsp.parking;

import ru.job4j.odd.lsp.parking.model.Transport;
import ru.job4j.odd.lsp.parking.store.Parking;

public class MainParking {

    private final Parking parking;

    public MainParking(Parking parking) {
        this.parking = parking;
    }

    public boolean park(Transport transport) {
        return false;
    }

    public Transport unPark(Transport transport) {
        return null;
    }

    public int freeSpaces(Transport transport) {
        return -1;
    }
}
