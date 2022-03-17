package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Bumps;
import org.junit.Test;

public class BumpsTest {
    @Test
    public void basicTest() {
        Assert.assertEquals(Bumps.bumps("n"), "Woohoo!");
        Assert.assertEquals(Bumps.bumps("_nnnnnnn_n__n______nn__nn_nnn"), "Car Dead");
        Assert.assertEquals(Bumps.bumps("______n___n_"), "Woohoo!");
        Assert.assertEquals(Bumps.bumps("nnnnnnnnnnnnnnnnnnnnn"), "Car Dead");
    }

}