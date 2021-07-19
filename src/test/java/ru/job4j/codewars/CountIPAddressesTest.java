package ru.job4j.codewars;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountIPAddressesTest {

    @Test
    public void ipsBetween() {
        assertEquals(50, CountIPAddresses.ipsBetween("10.0.0.0", "10.0.0.50"));
        assertEquals(246, CountIPAddresses.ipsBetween("20.0.0.10", "20.0.1.0"));
        assertEquals(243, CountIPAddresses.ipsBetween("20.0.0.1", "20.0.0.244"));
    }

}