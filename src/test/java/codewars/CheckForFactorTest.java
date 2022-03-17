package codewars;

import ru.codewars.eightkyu.CheckForFactor;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckForFactorTest {
    @Test
    public void basicTests() {
        assertTrue(CheckForFactor.checkForFactor(10, 2));
        assertTrue(CheckForFactor.checkForFactor(63, 7));
        assertTrue(CheckForFactor.checkForFactor(2450, 5));
        assertTrue(CheckForFactor.checkForFactor(24612, 3));
    }

}