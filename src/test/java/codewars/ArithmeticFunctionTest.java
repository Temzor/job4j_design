package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ArithmeticFunction;
import org.junit.Test;

public class ArithmeticFunctionTest {
    @Test
    public void testBasic() {
        Assert.assertEquals("'add' should return the two numbers added together!", 3, ArithmeticFunction.arithmetic(1, 2, "add"));
        Assert.assertEquals("'subtract' should return a minus b!", 6, ArithmeticFunction.arithmetic(8, 2, "subtract"));
        Assert.assertEquals("'multiply' should return a multiplied by b!", 10, ArithmeticFunction.arithmetic(5, 2, "multiply"));
        Assert.assertEquals("'divide' should return a divided by b!", 4, ArithmeticFunction.arithmetic(8, 2, "divide"));
    }

}