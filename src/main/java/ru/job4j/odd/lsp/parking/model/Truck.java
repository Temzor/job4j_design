package ru.job4j.odd.lsp.parking.model;

public class Truck implements Transport {

    private int size;

    private final String getEGovNumberTransport;

    public Truck(String govNumber, int size) {
        if (size < 2) {
            throw new IllegalArgumentException("Truck won't fit, need more space!");
        }
        this.size = size;
        this.getEGovNumberTransport = govNumber;
    }


    @Override
    public String getEGovNumberTransport() {
        return getEGovNumberTransport;
    }

    @Override
    public int getSizeTransport() {
        return size;
    }
}
