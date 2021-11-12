package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetMeTest {
    @Test
    public void basicTests() {
        assertEquals("Hello Riley!", GreetMe.greet("riley"));
        assertEquals("Hello Billy!", GreetMe.greet("BILLY"));
    }

}