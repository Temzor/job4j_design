package codewars;

import org.hamcrest.MatcherAssert;
import ru.codewars.eightkyu.BasicOperations;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BasicOperationsTest {
    @Test
    public void testBasics() {
        System.out.println("Basic Tests");
        MatcherAssert.assertThat(BasicOperations.basicMath("+", 4, 7), is(11));
        MatcherAssert.assertThat(BasicOperations.basicMath("-", 15, 18), is(-3));
        MatcherAssert.assertThat(BasicOperations.basicMath("*", 5, 5), is(25));
        MatcherAssert.assertThat(BasicOperations.basicMath("/", 49, 7), is(7));
    }
}
