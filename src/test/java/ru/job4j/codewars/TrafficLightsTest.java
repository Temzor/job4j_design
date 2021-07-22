package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrafficLightsTest {
    @Test
    public void updatelight() {
        assertEquals("green", TrafficLights.updateLight("red"));
        assertEquals("yellow", TrafficLights.updateLight("green"));
        assertEquals("red", TrafficLights.updateLight("yellow"));
    }

}