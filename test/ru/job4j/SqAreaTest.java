package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whensquare2thenp6() {
        int inp = 6;
        int ink = 2;
        double expected = SqArea.square(inp, ink);
        double out = 2;
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whensquare4thenp6() {
        int inp = 10;
        int ink = 4;
        double expected = SqArea.square(inp, ink);
        double out = 4;
        Assert.assertEquals(expected, out, 0.01);
    }
}