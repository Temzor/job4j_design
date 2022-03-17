package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.NameMe;
import junit.framework.TestCase;

public class NameMeTest  extends TestCase {
    public void testNameMeOne() {
        NameMe nameMe = new NameMe("John", "Doe");

        Assert.assertEquals("Verifying First name. Object returned should contain the firstname: John",
                "John",
                nameMe.getFirstName());

        Assert.assertEquals("Verifying Last name. Object returned should contain the lastname: Doe",
                "Doe",
                nameMe.getLastName());

        Assert.assertEquals("Verifying full name. Object returned should contain full name: John Doe",
                "John Doe",
                nameMe.getFullName());

        Assert.assertEquals("Verifying full name. Object returned should contain full name: John Doe",
                "John Doe",
                nameMe.getFullName());
    }

}