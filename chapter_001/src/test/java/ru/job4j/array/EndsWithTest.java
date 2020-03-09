package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EndsWithTest {
    @Test
    public void whenEndWithPrefixThanTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'e', 'l', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPrefixThanFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'H', 'e'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}