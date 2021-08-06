package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetVolumeOfCuboidTest {
    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals(4, GetVolumeOfCuboid.getVolumeOfCuboid(1, 2, 2), 0.0001);
        assertEquals(63, GetVolumeOfCuboid.getVolumeOfCuboid(6.3, 2, 5), 0.0001);
    }

}