package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.ToCamelCase;
import org.junit.Test;

public class ToCamelCaseTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: " + input);
        Assert.assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: " + input);
        Assert.assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
    }

}