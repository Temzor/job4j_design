package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Persist;
import org.junit.Test;

public class PersistTest {
    @Test
    public void basicTests() {
        System.out.println("****** Basic Tests ******");
        Assert.assertEquals(3, Persist.persistence(39));
        Assert.assertEquals(0, Persist.persistence(4));
        Assert.assertEquals(2, Persist.persistence(25));
        Assert.assertEquals(4, Persist.persistence(999));
    }

}