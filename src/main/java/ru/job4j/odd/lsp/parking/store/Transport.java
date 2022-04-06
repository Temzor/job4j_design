package ru.job4j.odd.lsp.parking.store;

import ru.job4j.odd.lsp.parking.model.Transport;

import java.util.List;

interface Parking {

    boolean add(Transport vehicle);

    Transport remove(Transport vehicle);

    Transport getTransport(String getEGovNumberTransport);

    List<Transport> getTransportList();

    int getMaxMotoSpaces();

    int getMaxCarSpaces();

    int getMaxTruckSpaces();

    int getSize();
}
