package ru.job4j.codewars;

import codewars.SaleHotdogs;
import org.junit.Assert;
import org.junit.Test;

public class SaleHotdogsTest {
    @Test
    public void basicTests() {
        Assert.assertEquals(100, SaleHotdogs.saleHotdogs(1));
        Assert.assertEquals(400, SaleHotdogs.saleHotdogs(4));
        Assert.assertEquals(475, SaleHotdogs.saleHotdogs(5));
        Assert.assertEquals(855, SaleHotdogs.saleHotdogs(9));
        Assert.assertEquals(900, SaleHotdogs.saleHotdogs(10));
        Assert.assertEquals(9000, SaleHotdogs.saleHotdogs(100));
    }
}