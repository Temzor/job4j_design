package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.AlphabetWar;
import org.junit.Test;

public class AlphabetWarTest {
    @Test
    public void basicTest() {
        Assert.assertEquals("Right side wins!", AlphabetWar.alphabetWar("z"));
        Assert.assertEquals("Let's fight again!", AlphabetWar.alphabetWar("zdqmwpbs"));
        Assert.assertEquals("Right side wins!", AlphabetWar.alphabetWar("zzzzs"));
        Assert.assertEquals("Left side wins!", AlphabetWar.alphabetWar("wwwwwwz"));
    }

}