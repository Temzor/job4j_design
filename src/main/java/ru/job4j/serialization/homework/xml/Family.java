package ru.job4j.serialization.homework.xml;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Family {
    private final String surname;
    private final boolean residents;
    private final int countPeople;
    private final ResidenceAddress residenceAddress;
    private final String[] sexChildren;

    public Family(String surname, boolean residents, int countPeople, ResidenceAddress residenceAddress, String[] sexChildren) {
        this.surname = surname;
        this.residents = residents;
        this.countPeople = countPeople;
        this.residenceAddress = residenceAddress;
        this.sexChildren = sexChildren;
    }

    @Override
    public String toString() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>"
                + "\n<surname=" + "\"" + surname + "\"" + "/>"
                + " \n\t<residents=" + "\"" + residents + "\"" + "/>"
                + " \n\t<countPeople=" + "\"" + countPeople + "\"" + "/>"
                + " \n\t<address" + residenceAddress + "\""
                + " \n\tsexChildren's=" + "\"" +  Arrays.toString(sexChildren) + "\""
                + "\n<surname/>";
    }
}
