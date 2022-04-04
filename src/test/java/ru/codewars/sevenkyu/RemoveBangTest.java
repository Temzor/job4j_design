package ru.codewars.sevenkyu;

import org.junit.Assert;
import org.junit.Test;

public class RemoveBangTest {
    @Test
    public void whenNormalString() {
        RemoveBang removeBang = new RemoveBang();
        String input = "Привет, как дела у тебя?";
        String expect = "Привет, как дела у тебя?";
        Assert.assertEquals(expect, removeBang.removeBang(input));
    }

    @Test
    public void whenNoNormalString() {
        RemoveBang removeBang = new RemoveBang();
        String input = "!!No! seriously! !Seriously!! !!Wow!";
        String expect = "!!No seriously !Seriously !!Wow";
        Assert.assertEquals(expect, removeBang.removeBang(input));
    }
}