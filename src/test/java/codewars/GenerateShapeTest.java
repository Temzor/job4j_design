package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.GenerateShape;
import org.junit.Test;

public class GenerateShapeTest {
    @Test
    public void exampleTests() {
        Assert.assertEquals("+++\n+++\n+++", GenerateShape.generateShape(3));
        Assert.assertEquals("+++++\n+++++\n+++++\n+++++\n+++++", GenerateShape.generateShape(5));
        Assert.assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", GenerateShape.generateShape(8));
    }
}