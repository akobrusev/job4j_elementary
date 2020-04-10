package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int n = 5;
        int expected = 120;
        int out = Factorial.calc(n);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int expected = 1;
        int out = Factorial.calc(n);
        Assert.assertEquals(expected, out);
    }
}