package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenFactorialFiveIs120() {
        int rsl = Factorial.calc(5);
        assertThat(rsl, is(120));
    }

    @Test
    public void whenFactorialZeroIs1() {
        int rsl = Factorial.calc(0);
        assertThat(rsl, is(1));
    }

    @Test
    public void whenFactorialOneIs1() {
        int rsl = Factorial.calc(1);
        assertThat(rsl, is(1));
    }

    @Test
    public void whenFactorialTenIs3628800() {
        int rsl = Factorial.calc(10);
        assertThat(rsl, is(3628800));
    }
}