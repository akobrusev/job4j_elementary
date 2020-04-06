package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whendistance2then() {
        int inx1 = 0;
        int iny1 = 0;
        int inx2 = 2;
        int iny2 = 0;
        double expected = 2;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whendistance5then() {
        int inx1 = 2;
        int iny1 = 5;
        int inx2 = 6;
        int iny2 = 8;
        double expected = 5;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whendistancethen() {
        int inx1 = 4;
        int iny1 = 5;
        int inx2 = 0;
        int iny2 = 10;
        double expected = 6.4;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }
}