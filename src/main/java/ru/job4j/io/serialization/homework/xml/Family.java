package ru.job4j.io.serialization.homework.xml;

import lombok.SneakyThrows;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.StringJoiner;

@XmlRootElement(name = "family")
@XmlAccessorType(XmlAccessType.FIELD)
public class Family {
    @XmlAttribute
    private  String surname;
    @XmlAttribute
    private  boolean residents;
    @XmlAttribute
    private  int countPeople;
    private  ResidenceAddress residenceAddress;
    @XmlElementWrapper(name = "sexes")
    @XmlElement(name = "sex")
    private  String[] sexChildren;

    public Family() { }

    public Family(String surname, boolean residents, int countPeople, ResidenceAddress residenceAddress, String[] sexChildren) {
        this.surname = surname;
        this.residents = residents;
        this.countPeople = countPeople;
        this.residenceAddress = residenceAddress;
        this.sexChildren = sexChildren;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Family.class.getSimpleName() + "[", "]")
                .add("surname='" + surname + "'")
                .add("residents=" + residents)
                .add("countPeople=" + countPeople)
                .add("residenceAddress=" + residenceAddress)
                .add("sexChildren=" + Arrays.toString(sexChildren))
                .toString();
    }

    @SneakyThrows
    public static void main(String[] args) {
        final Family family = new Family("Kapustin's", true, 4, new ResidenceAddress(
                "Saint Petersburg", 194352, "Rudneva", 15, 122), new String[] {"male", "female"});

        JAXBContext context = JAXBContext.newInstance(Family.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        try (StringWriter writer = new StringWriter()) {
            marshaller.marshal(family, writer);
            String result = writer.getBuffer().toString();
            System.out.println(result);
        }  catch (Exception ignored) {

        }
    }
}
