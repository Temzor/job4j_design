package ru.job4j.io.serialization.homework.json;


import java.util.Arrays;

public class Building {
    private final String city;
    private final boolean isCommerce;
    private final int countFloors;
    private final Street street;
    private final int[] buildDone;

    public Building(String city, boolean isCommerce, int countFloors, Street street, int[] buildDone) {
        this.city = city;
        this.isCommerce = isCommerce;
        this.countFloors = countFloors;
        this.street = street;
        this.buildDone = buildDone;
    }

    @Override
    public String toString() {
        return "Build{"
                + "city=" + city
                + ", is_commerce=" + isCommerce
                + ", floor=" + countFloors
                + ", street=" + street
                + ", build_done=" + Arrays.toString(buildDone)
                + '}';
    }

    public String getCity() {
        return city;
    }

    public boolean getIsCommerce() {
        return isCommerce;
    }

    public int getCountFloors() {
        return countFloors;
    }

    public Street getStreet() {
        return street;
    }

    public int[] getBuildDone() {
        return buildDone;
    }
}
