package edu;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.StringJoiner;

public class VehicleMake implements Comparable<VehicleMake> {
    private final String name;
    private final String country;


    public VehicleMake(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "[", "]")
                .add("name='" + name + "'")
                .add("country='" + country + "'")
                .toString();
    }

    @Override
    public int compareTo(@NotNull VehicleMake o) {
        int compare = country.compareTo(o.country);
        return compare == 0 ? name.compareTo(o.name) : compare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VehicleMake that = (VehicleMake) o;
        return Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }
}
