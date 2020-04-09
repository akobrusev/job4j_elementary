package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void whenConvert300RblThen5Dlr() {
        int in = 300;
        int expected = 5;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert5EURThen350Ruble() {
        int in = 5;
        int expected = 350;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert6DlrThen360Ruble() {
        int in = 6;
        int expected = 360;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert2DlrThen150Ruble() {
        float in = 2.5f;
        int expected = 150;
        float out = Converter.dollarToRubleF(in);
        Assert.assertEquals(expected, out, 1.01);
    }


}