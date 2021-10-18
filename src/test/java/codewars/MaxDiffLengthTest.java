package codewars;

import codewars.MaxDiffLength;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxDiffLengthTest {
    @Test
    public void test() {
        System.out.println("mxdiflg Fixed Tests");
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        assertEquals(13, MaxDiffLength.maxDiffLength(s1, s2)); // 13
    }

}