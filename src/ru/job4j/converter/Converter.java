package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro (int value) {
        int rsl = value/70;
        return rsl;
            }
    public static int rubleToDollar (int value) {
        int rsl = value/60;
        return rsl;
    }
    public static float rubleToEuroF (float value){
        float rsl = value/70;
        return rsl;
    }
    public static int euroToRuble (int value) {
        int rsl = value * 70;
        return rsl;
    }
    public static int dollarToRuble (int value){
        int rsl = value * 60;
        return rsl;
    }
    public static float dollarToRubleF (float value){
        float rsl = value * 60;
        return rsl;
    }
    public static void main (String [] arsg){
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(300);
        float euroF = Converter.rubleToEuroF(150);
        int rublesE = Converter.euroToRuble(5);
        int rublesD = Converter.dollarToRuble(6);
        float rublesF = Converter.dollarToRubleF(2.5f);
        System.out.println ("140 rubles are " + euro + " euro. ");
        System.out.println ("300 rubles are " + dollar + " dollar. ");
        System.out.println ("150 rubles are " + euroF + " euro. ");
        System.out.println ("5 euro are " + rublesE + " rubles. ");
        System.out.println ("6 dollar are " + rublesD + " rubles. ");
        System.out.println ("2.5 dollar are " + rublesF + " rubles. ");
    }
}
