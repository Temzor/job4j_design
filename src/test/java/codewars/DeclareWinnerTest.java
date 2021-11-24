package codewars;

import codewars.DeclareWinner;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeclareWinnerTest {
        @Test
        public void basicTests() {
            assertEquals("Lew", DeclareWinner.declareWinner(new DeclareWinner.Fighter("Lew", 10, 2), new DeclareWinner.Fighter("Harry", 5, 4), "Lew"));
            assertEquals("Harry", DeclareWinner.declareWinner(new DeclareWinner.Fighter("Lew", 10, 2), new DeclareWinner.Fighter("Harry", 5, 4), "Harry"));
            assertEquals("Harald", DeclareWinner.declareWinner(new DeclareWinner.Fighter("Harald", 20, 5), new DeclareWinner.Fighter("Harry", 5, 4), "Harry"));
            assertEquals("Harald", DeclareWinner.declareWinner(new DeclareWinner.Fighter("Harald", 20, 5), new DeclareWinner.Fighter("Harry", 5, 4), "Harald"));
            assertEquals("Harald", DeclareWinner.declareWinner(new DeclareWinner.Fighter("Jerry", 30, 3), new DeclareWinner.Fighter("Harald", 20, 5), "Jerry"));
            assertEquals("Harald", DeclareWinner.declareWinner(new DeclareWinner.Fighter("Jerry", 30, 3), new DeclareWinner.Fighter("Harald", 20, 5), "Harald"));
        }

    }
