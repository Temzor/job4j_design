package ru.job4j.io;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class DirTest {

    File file = new File("c:\\projects");

    @Test
    public void testOne() {
        Assert.assertEquals(222, file.getTotalSpace() / 1073741824);
    }

}