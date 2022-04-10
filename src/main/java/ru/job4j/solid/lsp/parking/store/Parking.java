package ru.job4j.solid.lsp.parking.store;

import ru.job4j.solid.lsp.parking.model.Transport;

import java.util.List;

public interface Parking {

    boolean park(Transport transport);

}
