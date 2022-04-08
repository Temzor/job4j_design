package ru.job4j.odd.lsp.parking;

import ru.job4j.odd.lsp.parking.model.Car;
import ru.job4j.odd.lsp.parking.model.Transport;
import ru.job4j.odd.lsp.parking.store.Parking;

import java.util.ArrayList;
import java.util.List;

public class GoToParking implements Parking {


    public GoToParking(int i, int i1) {
    }

    @Override
    public boolean park(Transport transport) {
        return false;
    }
}
