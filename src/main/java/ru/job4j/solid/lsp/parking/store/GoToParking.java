package ru.job4j.solid.lsp.parking.store;

import ru.job4j.solid.lsp.parking.model.Transport;

import java.util.List;

public class GoToParking implements Parking {

    private final int parkingSpaces;
    private final int maxTruckSpaces;

    public GoToParking(int parkingSpaces, int maxTruckSpaces) {
        this.parkingSpaces = parkingSpaces;
        this.maxTruckSpaces = maxTruckSpaces;
    }

    @Override
    public boolean add(Transport transport) {
        return false;
    }

    @Override
    public Transport remove(Transport transport) {
        return null;
    }

    @Override
    public Transport getTransport(String getEGovNumberTransport) {
        return null;
    }

    @Override
    public List<Transport> getTransportList() {
        return null;
    }
}
