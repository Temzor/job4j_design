package ru.job4j.io.serialization.homework.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.StringJoiner;

@XmlRootElement(name = "contact")
public class ResidenceAddress {
    @XmlAttribute
    private  String city;
    @XmlAttribute
    private  int zipCode;
    @XmlAttribute
    private  String street;
    @XmlAttribute
    private  int buildNumber;
    @XmlAttribute
    private  int apartmentNumber;

    public ResidenceAddress() {

    }

    public ResidenceAddress(String city, int zipCode, String street, int buildNumber, int apartmentNumber) {
        this.city = city;
        this.zipCode = zipCode;
        this.street = street;
        this.buildNumber = buildNumber;
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ResidenceAddress.class.getSimpleName() + "[", "]")
                .add("city='" + city + "'")
                .add("zipCode=" + zipCode)
                .add("street='" + street + "'")
                .add("buildNumber=" + buildNumber)
                .add("apartmentNumber=" + apartmentNumber)
                .toString();
    }
}
