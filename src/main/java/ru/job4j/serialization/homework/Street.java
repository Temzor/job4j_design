package ru.job4j.serialization.homework;

import java.util.StringJoiner;

public class Street {
    private final String nameStreet;

    public Street(String nameStreet) {
        this.nameStreet = nameStreet;
    }

    @Override
    public String toString() {
        return "Address{"
                + "street='" + nameStreet
                + '}';
    }
}

