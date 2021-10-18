package codewars;

import codewars.Cockroach;
import org.junit.Test;

import static org.junit.Assert.*;

public class CockroachTest {
    @Test
    public void basicTests() {
        Cockroach cockroach = new Cockroach();
        assertEquals(30, cockroach.cockroachSpeed(1.08));
        assertEquals(30, cockroach.cockroachSpeed(1.09));
        assertEquals(0, cockroach.cockroachSpeed(0));
    }

}