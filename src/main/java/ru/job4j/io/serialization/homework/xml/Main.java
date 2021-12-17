package ru.job4j.io.serialization.homework.xml;


import lombok.SneakyThrows;
import ru.job4j.io.serialization.xml.Person;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.io.StringReader;
import java.io.StringWriter;

import static javax.xml.bind.JAXBContext.newInstance;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        final Family family = new Family("Kapustin's", true, 4, new ResidenceAddress(
                "Saint Petersburg", 194352, "Rudneva", 15, 122), new String[] {"male", "female"});

        JAXBContext context;
        context = newInstance(Family.class);

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        String xml;

        try (StringWriter writer = new StringWriter()) {
            /* Сериализуем */
            marshaller.marshal(family, writer);
            xml = writer.getBuffer().toString();
            System.out.println(xml);

            Unmarshaller unmarshaller = context.createUnmarshaller();
            try (StringReader reader = new StringReader(xml)) {
                /* десериализуем */
                Family result = (Family) unmarshaller.unmarshal(reader);
                System.out.println(result);
            }
        }
    }
}
