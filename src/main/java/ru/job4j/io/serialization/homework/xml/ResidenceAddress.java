package ru.job4j.io.serialization.homework.xml;

public class ResidenceAddress {
    private final String city;
    private final int zipCode;
    private final String street;
    private final int buildNumber;
    private final int apartmentNumber;

    public ResidenceAddress(String city, int zipCode, String street, int buildNumber, int apartmentNumber) {
        this.city = city;
        this.zipCode = zipCode;
        this.street = street;
        this.buildNumber = buildNumber;
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString() {
        return " city=" + "\"" + city + "\""
                + " zipCode=" + "\"" + zipCode + "\""
                + " street=" + "\"" + street + "\""
                + " buildNumber=" + "\"" + buildNumber + "\""
                + " apartmentNumber=" + "\"" + apartmentNumber + "\""
                + "/>";
    }
}
