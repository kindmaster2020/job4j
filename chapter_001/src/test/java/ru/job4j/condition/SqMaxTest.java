package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void whenFirstMax() {
        int result = SqMax.max(10, 6, 9, 3);
        assertThat(result, is(10));
    }

    @Test
    public void whenSecondtMax() {
        int result = SqMax.max(7, 9, 4, 1);
        assertThat(result, is(9));
    }

    @Test
    public void whenThirdMax() {
        int result = SqMax.max(6, 4, 7, 5);
        assertThat(result, is(7));
    }

    @Test
    public void whenForthMax() {
        int result = SqMax.max(9, 2, 8, 9);
        assertThat(result, is(9));
    }
}