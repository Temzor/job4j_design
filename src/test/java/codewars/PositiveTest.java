package codewars;

import org.junit.Assert;
import ru.codewars.eightkyu.Positive;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;



public class PositiveTest {

        @Test
        public void testSomething() {
            Assert.assertEquals(15, Positive.sum(new int[]{1, 2, 3, 4, 5}));
            Assert.assertEquals(13, Positive.sum(new int[]{1, -2, 3, 4, 5}));
            Assert.assertEquals(0, Positive.sum(new int[]{}));
            Assert.assertEquals(0, Positive.sum(new int[]{-1, -2, -3, -4, -5}));
            Assert.assertEquals(9, Positive.sum(new int[]{-1, 2, 3, 4, -5}));
        }

        private int random(int min, int max) {
            return min + (int) (Math.random() * (max - min));
        }

        private int[] randomArray() {
            int randomSize = random(10, 5000);
            int[] arr = new int[randomSize];
            for (int i = 0; i < randomSize; i++) {
                arr[i] = random(-100, 100);
            }
            return arr;
        }

        private int sum(int[] arr) {
            return Arrays.stream(arr).filter(elt -> elt > 0).reduce(0, Integer::sum);
        }

        @Test
        public void randomArrayTest() {
            for (int i = 0; i < 100; i++) {
                int[] arr = randomArray();
                Assert.assertEquals(sum(arr), Positive.sum(arr));
            }
        }
    }


