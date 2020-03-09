package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSortFiveElements() {
        int[] input = {69, 51, 20, 76, -5};
        int[] result = SortSelected.sort(input);
        int[] expect = {-5, 20, 51, 69, 76};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortThreeElements() {
        int[] input = {12, -3, 3};
        int[] result = SortSelected.sort(input);
        int[] expect = {-3, 3, 12};
        assertThat(result, is(expect));
    }
}