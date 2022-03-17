package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.PaperFolder;
import org.junit.Test;

public class PaperFolderTest {
    @Test
    public void sampleTests() {
        Assert.assertEquals((Long) 42L, PaperFolder.fold(384000000.0));
        Assert.assertEquals((Long) 0L, PaperFolder.fold(0.00005));
        Assert.assertEquals((Long) 0L, PaperFolder.fold(0.0));
    }


}