package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        int inMW = 181;
        double expectedMW = 93.15;
        double outMW = Fit.manWeight(inMW);
        Assert.assertEquals(expectedMW, outMW, 0.01);
    }

    @Test
    public void womanWeight() {
        int inWW = 161;
        double expectedWW = 58.65;
        double outWW = Fit.womanWeight(inWW);
        Assert.assertEquals(expectedWW, outWW, 0.01);

    }
}