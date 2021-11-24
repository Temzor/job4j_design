package codewars;

import codewars.DescendingOrder;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescendingOrderTest {
    @Test
    public void test01() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test02() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }


    @Test
    public void test03() {
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }

}