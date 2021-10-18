package codewars;

import codewars.SeatsInTheater;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeatsInTheaterTest {
    @Test
    public void exampleTests() {
        assertEquals(96, SeatsInTheater.seatsInTheater(16, 11, 5, 3));
        assertEquals(0, SeatsInTheater.seatsInTheater(1, 1, 1, 1));
        assertEquals(18, SeatsInTheater.seatsInTheater(13, 6, 8, 3));
        assertEquals(99, SeatsInTheater.seatsInTheater(60, 100, 60, 1));
        assertEquals(0, SeatsInTheater.seatsInTheater(1000, 1000, 1000, 1000));
    }

}