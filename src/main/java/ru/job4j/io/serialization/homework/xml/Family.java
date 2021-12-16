package ru.job4j.io.serialization.homework.xml;

import java.util.Arrays;

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
                + "\n<family surname=" + "\"" + surname + "\"" + ">"
                + " \n\t<residents citizenship=" + "\"" + residents + "\"" + "/>"
                + " \n\t<countPeople count=" + "\"" + countPeople + "\"" + "/>"
                + " \n\t<address" + residenceAddress + "\""
                + " \n\t<sexchildren>"
                +  "\n\t\t<sex>" + Arrays.toString(new String[]{sexChildren[0]}) + "</sex>"
                +  "\n\t\t<sex>" + Arrays.toString(new String[]{sexChildren[1]}) + "</sex>"
                + " \n\t</sexchildren>"
                + "\n</family>";
    }
}
