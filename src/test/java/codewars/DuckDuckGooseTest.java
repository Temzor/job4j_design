package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.DuckDuckGoose;
import ru.codewars.eightkyu.Player;
import org.junit.Test;

public class DuckDuckGooseTest {
    @Test
    public void tests() {
        Player[] players = makePlayerArr(new String[] {"a", "b", "c", "d", "c", "e", "f", "g", "h", "z"});
        Assert.assertEquals("a", DuckDuckGoose.duckDuckGoose(players, 1));
        Assert.assertEquals("c", DuckDuckGoose.duckDuckGoose(players, 3));
        Assert.assertEquals("z", DuckDuckGoose.duckDuckGoose(players, 10));
        Assert.assertEquals("z", DuckDuckGoose.duckDuckGoose(players, 20));
        Assert.assertEquals("z", DuckDuckGoose.duckDuckGoose(players, 30));
        Assert.assertEquals("g", DuckDuckGoose.duckDuckGoose(players, 18));
        Assert.assertEquals("g", DuckDuckGoose.duckDuckGoose(players, 28));
        Assert.assertEquals("b", DuckDuckGoose.duckDuckGoose(players, 12));
        Assert.assertEquals("b", DuckDuckGoose.duckDuckGoose(players, 2));
        Assert.assertEquals("f", DuckDuckGoose.duckDuckGoose(players, 7));
    }

    private Player[] makePlayerArr(String[] names) {
        Player[] players = new Player[names.length];
        for (int i = 0; i < names.length; i++) {
            players[i] = new Player(names[i]);
        }
        return players;
    }

}