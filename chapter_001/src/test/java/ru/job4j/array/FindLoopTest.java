package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Than0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int start = 0;
        int finish = 2;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayNotHave7ThanMinus1() {
        int[] input = new int[] {3, 18, 12, 25};
        int value = 7;
        int start = 0;
        int finish = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas2Than0() {
        int[] input = new int[] {2, 10, 7, 2, 3};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayNotHave8ThanMinus1() {
        int[] input = new int[] {8, 18, 12, 25, 67, 4, 52, 8};
        int value = 8;
        int start = 2;
        int finish = 6;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}