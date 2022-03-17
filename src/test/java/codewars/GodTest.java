package codewars;

import ru.codewars.eightkyu.God;
import ru.codewars.eightkyu.Human;
import ru.codewars.eightkyu.Man;
import org.junit.Test;

import static org.junit.Assert.*;

public class GodTest {
    @Test
    public void makingAdam() {
        Human[] paradise = God.create();
        assertTrue("Adam are a man", paradise[0] instanceof Man);

    }
}