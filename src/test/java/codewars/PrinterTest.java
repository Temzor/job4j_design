package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Printer;
import org.junit.Test;

public class PrinterTest {
    @Test
    public void test() {
        System.out.println("printerError Fixed Tests");
        String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        Assert.assertEquals("3/56", Printer.printerError(s));
    }

}