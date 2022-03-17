package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.DeclareWinner;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeclareWinnerTest {
        @Test
        public void basicTests() {
            Assert.assertEquals("Lew", DeclareWinner.declareWinner(new DeclareWinner.Fighter("Lew", 10, 2), new DeclareWinner.Fighter("Harry", 5, 4), "Lew"));
            Assert.assertEquals("Harry", DeclareWinner.declareWinner(new DeclareWinner.Fighter("Lew", 10, 2), new DeclareWinner.Fighter("Harry", 5, 4), "Harry"));
            Assert.assertEquals("Harald", DeclareWinner.declareWinner(new DeclareWinner.Fighter("Harald", 20, 5), new DeclareWinner.Fighter("Harry", 5, 4), "Harry"));
            Assert.assertEquals("Harald", DeclareWinner.declareWinner(new DeclareWinner.Fighter("Harald", 20, 5), new DeclareWinner.Fighter("Harry", 5, 4), "Harald"));
            Assert.assertEquals("Harald", DeclareWinner.declareWinner(new DeclareWinner.Fighter("Jerry", 30, 3), new DeclareWinner.Fighter("Harald", 20, 5), "Jerry"));
            Assert.assertEquals("Harald", DeclareWinner.declareWinner(new DeclareWinner.Fighter("Jerry", 30, 3), new DeclareWinner.Fighter("Harald", 20, 5), "Harald"));
        }

    }
