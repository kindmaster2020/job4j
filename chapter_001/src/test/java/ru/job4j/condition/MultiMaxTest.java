package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(10, 2, 3);
        assertThat(result, is(10));
    }
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 20, 3);
        assertThat(result, is(20));
    }
    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 2, 30);
        assertThat(result, is(30));
    }
    @Test
    public void whenFirstEqualsSecondEqualsThird() {
        int result = MultiMax.max(40, 40, 40);
        assertThat(result, is(40));
    }
}