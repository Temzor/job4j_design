package ru.job4j.odd.lsp.parking.model;

public class Car implements Transport {

    public static final int SIZE = 1;

    private final String getEGovNumberTransport;

    public Car(String govNumber) {
        this.getEGovNumberTransport = govNumber;
    }


    @Override
    public String getEGovNumberTransport() {
        return getEGovNumberTransport;
    }

    @Override
    public int getSizeTransport() {
        return SIZE;
    }
}
