package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.CharProblem;
import org.junit.Test;

public class CharProblemTestTest {
    @Test
    public void test1() {
        Assert.assertEquals(5, CharProblem.howOld("5 years old"));
    }
    @Test
    public void test2() {
        Assert.assertEquals(9, CharProblem.howOld("9 years old"));
    }
    @Test
    public void test3() {
        Assert.assertEquals(1, CharProblem.howOld("1 year old"));
    }

}