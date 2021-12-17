package ru.job4j.io.serialization.homework.json;


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

    public String getNameStreet() {
        return nameStreet;
    }
}

