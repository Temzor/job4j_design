package codewars;

import codewars.BalancedNum;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedNumTest {
    @Test
    public void checkBalancedNumber() {
        assertEquals("Balanced", BalancedNum.balancedNum(7));
        assertEquals("Balanced", BalancedNum.balancedNum(959));
        assertEquals("Balanced", BalancedNum.balancedNum(13));
        assertEquals("Not Balanced", BalancedNum.balancedNum(432));
        assertEquals("Balanced", BalancedNum.balancedNum(424));
    }
    @Test
    public void checkLargerNumber() {
        assertEquals("Not Balanced", BalancedNum.balancedNum(1024));
        assertEquals("Not Balanced", BalancedNum.balancedNum(66545));
        assertEquals("Not Balanced", BalancedNum.balancedNum(295591));
        assertEquals("Not Balanced", BalancedNum.balancedNum(1230987));
        assertEquals("Balanced", BalancedNum.balancedNum(56239814));
    }

}