package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.RockPaperScissors;
import org.junit.Test;

public class RockPaperScissorsTest {
    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        Assert.assertEquals("Player 1 won!", RockPaperScissors.rps("rock", "scissors"));
        Assert.assertEquals("Player 1 won!", RockPaperScissors.rps("scissors", "paper"));
        Assert.assertEquals("Player 1 won!", RockPaperScissors.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        Assert.assertEquals("Player 2 won!", RockPaperScissors.rps("scissors", "rock"));
        Assert.assertEquals("Player 2 won!", RockPaperScissors.rps("paper", "scissors"));
        Assert.assertEquals("Player 2 won!", RockPaperScissors.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        Assert.assertEquals("Draw!", RockPaperScissors.rps("scissors", "scissors"));
        Assert.assertEquals("Draw!", RockPaperScissors.rps("paper", "paper"));
        Assert.assertEquals("Draw!", RockPaperScissors.rps("rock", "rock"));
    }

}