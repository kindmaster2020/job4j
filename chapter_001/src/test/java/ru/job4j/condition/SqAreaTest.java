package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square1() {
        int p = 6;
        int k = 2;
        double expected1 = 2.0;
        double out1 = SqArea.square(p, k);
        Assert.assertEquals(expected1, out1, 0.01);
    }

    @Test
    public void square2() {
        int p = 4;
        int k = 1;
        double expected2 = 1.0;
        double out2 = SqArea.square(p, k);
        Assert.assertEquals(expected2, out2, 0.01);
    }
}