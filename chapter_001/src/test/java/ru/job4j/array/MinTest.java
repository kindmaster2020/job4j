package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinTest {

    @Test
    public void whenFirstMin() {
        assertThat(
                Min.findMin(
                        new int[] {0, 5, 10}
                ),
                is(0)
        );
    }

    @Test
    public void whenMiddleMin() {
        assertThat(
                Min.findMin(
                        new int[] {15, 6, 28}
                ),
                is(6)
        );
    }

    @Test
    public void whenLastMin() {
        assertThat(
                Min.findMin(
                        new int[] {56, 45, 14}
                ),
                is(14)
        );
    }
}