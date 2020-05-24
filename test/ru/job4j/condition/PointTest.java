package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public  void whendistance2then() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public  void whendistance5then() {
        Point a = new Point(2, 5);
        Point b = new Point(6, 8);
        double expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public  void whendistancethen() {
        Point a = new Point(4, 5);
        Point b = new Point(0, 10);
        double expected = 6.4;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}