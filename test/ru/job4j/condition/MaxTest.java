package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then1() {
        int result = Max.max(5, 3, 4);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax6To6Then8When10() {
        int result = Max.max(6, 6,8,10);
        assertThat(result, is(10));
    }
}