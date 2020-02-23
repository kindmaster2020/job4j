package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 700;
        int expected = 10;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 300;
        int expected1 = 5;
        int out1 = Converter.rubleToDollar(in);
        Assert.assertEquals(expected1, out1);
    }
}