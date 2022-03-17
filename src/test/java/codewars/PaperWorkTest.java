package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.PaperWork;
import org.junit.Test;

public class PaperWorkTest {
    @Test
    public void test1() {
        Assert.assertEquals("Failed at paperWork(5,5)", 25, PaperWork.paperWork(5, 5));
    }

}