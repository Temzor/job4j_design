package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.leetcode.easy.MajorityElement;

class MajorityElementTest {
    @Test
    public void testOne() {
        MajorityElement majorityElement = new MajorityElement();
        int[] ints = new int[] {3, 2, 3};
        Assertions.assertEquals(3, majorityElement.majorityElement(ints));
    }

        @Test
        public void testTwo() {
            MajorityElement majorityElement = new MajorityElement();
            int[] ints = new int[] {2, 2, 1, 1, 1, 2, 2};
            Assertions.assertEquals(2, majorityElement.majorityElement(ints));
        }

    @Test
    public void testThree() {
        MajorityElement majorityElement = new MajorityElement();
        int[] ints = new int[] {8, 8, 8, 12, 12, 18, 18, 23};
        Assertions.assertEquals(12, majorityElement.majorityElement(ints));
    }
}