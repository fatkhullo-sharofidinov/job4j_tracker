package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void max() {
        int first = 23;
        int second = 31;
        int rsl = Max.max(first, second);
        int exp = 31;
        Assert.assertEquals(rsl, exp);
    }

    @Test
    public void testMax() {
            int first = 23;
            int second = 31;
            int third = 99;
            int rsl = Max.max(first, second, third);
            int exp = 99;
            Assert.assertEquals(rsl, exp);
    }

    @Test
    public void testMax1() {
        int first = 23;
        int second = 31;
        int third = 99;
        int fourth = 29;
        int rsl = Max.max(first, second, third);
        int exp = 99;
        Assert.assertEquals(rsl, exp);
    }
}