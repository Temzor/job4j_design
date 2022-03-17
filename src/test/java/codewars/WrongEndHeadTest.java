package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.WrongEndHead;
import org.junit.Test;

public class WrongEndHeadTest {
    @Test
    public void exampleTest1() {
        Assert.assertArrayEquals(new String[]{"head", "body", "tail" },
                WrongEndHead.fixTheMeerkat(new String[]{"tail", "body", "head" }));
    }

    @Test
    public void exampleTest2() {
        Assert.assertArrayEquals(new String[]{"heads", "body", "tails" },
                WrongEndHead.fixTheMeerkat(new String[]{"tails", "body", "heads" }));
    }


    @Test
    public void exampleTest3() {
        Assert.assertArrayEquals(new String[]{"top", "middle", "bottom" },
                WrongEndHead.fixTheMeerkat(new String[]{"bottom", "middle", "top" }));
    }

    @Test
    public void exampleTest4() {
        Assert.assertArrayEquals(new String[]{"upper legs", "torso", "lower legs" },
                WrongEndHead.fixTheMeerkat(new String[]{"lower legs", "torso", "upper legs" }));
    }

    @Test
    public void exampleTest5() {
        Assert.assertArrayEquals(new String[]{"sky", "rainbow", "ground" },
                WrongEndHead.fixTheMeerkat(new String[]{"ground", "rainbow", "sky" }));
    }

}