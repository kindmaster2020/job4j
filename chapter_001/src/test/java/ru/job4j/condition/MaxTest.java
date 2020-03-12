package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMaxFirstToSecond() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void whenMaxSecondToFirst() {
        int result = Max.max(5, 6);
        assertThat(result, is(6));
    }
    @Test
    public void whenFirstEqualSecond() {
        int result = Max.max(7, 7);
        assertThat(result, is(7));
    }
}