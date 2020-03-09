package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinDiapasonTest {

    @Test
    public void whenFirstMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {1, 5, 7, 19, 84, 54, 23},
                        2, 5
                ),
                is(7)
        );
    }

    @Test
    public void whenMiddleMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {-1, 53, 87, 66, 21, 17, 80},
                        4, 6
                ),
                is(17)
        );
    }

    @Test
    public void whenLastMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {74, -32, 48, 93, 46, 3, -37},
                        2, 5
                ),
                is(3)
        );
    }
}