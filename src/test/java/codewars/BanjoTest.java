package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Banjo;
import org.junit.Test;

public class BanjoTest {
    @Test
    public void peopleThatPlayBanjo() {
        Assert.assertEquals("Nope!", "Martin does not play banjo", Banjo.areYouPlayingBanjo("Martin"));
        Assert.assertEquals("Nope!", "Rikke plays banjo", Banjo.areYouPlayingBanjo("Rikke"));
    }

}