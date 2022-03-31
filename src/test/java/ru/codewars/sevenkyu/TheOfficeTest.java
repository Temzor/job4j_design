package ru.codewars.sevenkyu;

import org.junit.Assert;
import org.junit.Test;

public class TheOfficeTest {

    @Test
    public void thenOneCLose() {
        TheOffice theOffice = new TheOffice();
        char[] input = new char[]{'O', 'X', 'X', 'X', 'X'};
        Assert.assertEquals(0, theOffice.meeting(input));
    }

    @Test
    public void thenNoCLose() {
        TheOffice theOffice = new TheOffice();
        char[] input = new char[]{'X', 'X', 'X', 'X', 'X'};
        Assert.assertEquals("None available!", theOffice.meeting(input));
    }

    @Test
    public void thenManyCLose() {
        TheOffice theOffice = new TheOffice();
        char[] input = new char[]{'O', 'X', 'O', 'X', 'O'};
        Assert.assertEquals(0, theOffice.meeting(input));
    }

}