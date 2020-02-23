package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance1() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double extepted1 = 2.0;
        double out1 = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(extepted1, out1, 0.01);
    }

    @Test
    public void distance2() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 5;
        int y2 = 4;
        double extepted2 = 5.0;
        double out2 = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(extepted2, out2, 0.01);
    }
}