package codewars;

import org.hamcrest.MatcherAssert;
import ru.codewars.eightkyu.Order;
import org.junit.Test;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class OrderTest {
    @Test
    public void test1() {
        MatcherAssert.assertThat(Order.order("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
    }

    @Test
    public void test2() {
        MatcherAssert.assertThat(Order.order("4of Fo1r pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
    }

    @Test
    public void test3() {
        MatcherAssert.assertThat("Empty input should return empty string", Order.order(""), equalTo(""));
    }

}