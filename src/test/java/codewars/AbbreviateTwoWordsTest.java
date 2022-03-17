package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.AbbreviateTwoWords;
import org.junit.Test;

public class AbbreviateTwoWordsTest {
    @Test
    public void testFixed() {
        Assert.assertEquals("S.H", AbbreviateTwoWords.abbrevName("Sam Harris"));
        Assert.assertEquals("P.F", AbbreviateTwoWords.abbrevName("Patrick Feenan"));
        Assert.assertEquals("E.C", AbbreviateTwoWords.abbrevName("Evan Cole"));
        Assert.assertEquals("P.F", AbbreviateTwoWords.abbrevName("P Favuzzi"));
        Assert.assertEquals("D.M", AbbreviateTwoWords.abbrevName("David Mendieta"));
    }

}