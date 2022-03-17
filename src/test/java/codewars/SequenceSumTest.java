package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.SequenceSum;
import org.junit.Test;

public class SequenceSumTest {
    @Test
    public void testBasic() {
        Assert.assertEquals("0+1+2+3+4+5+6 = 21", SequenceSum.showSequence(6));
        Assert.assertEquals("-1<0", SequenceSum.showSequence(-1));
        Assert.assertEquals("0=0", SequenceSum.showSequence(0));
    }

}