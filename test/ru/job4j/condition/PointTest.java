package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public  void whendistance2then() {
        Point a = new Point(0, 0,0);
        Point b = new Point(0, 2,3);
        double expected = 3.6;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public  void whendistance5then() {
        Point a = new Point(2, 5,5);
        Point b = new Point(6, 8,4);
        double expected = 5.09;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public  void whendistancethen() {
        Point a = new Point(4, 5,7);
        Point b = new Point(0, 10,8);
        double expected = 6.48;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}