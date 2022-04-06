package ru.job4j.odd.lsp.parking.store;

import ru.job4j.odd.lsp.parking.model.Transport;

import java.util.List;

public interface Parking {

    boolean add(Transport transport);

    Transport remove(Transport transport);

    Transport getTransport(String getEGovNumberTransport);

    List<Transport> getTransportList();

}
