package ru.job4j.converter;
/**
 * Converter.
 *
 * @author Anton Kobrusev (akobrusev@gmail.com)
 */
public class Converter {

    /**
     * @param value водные данные, колличество валюты
     * @return возврат результата, деление валюты на курс.
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
            }
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }
    public static float rubleToEuroF(float value) {
        float rsl = value / 70;
        return rsl;
    }
    public static int euroToRuble(int value) {
        int rsl = value * 70;
        return rsl;
    }
    public static int dollarToRuble(int value) {
        int rsl = value * 60;
        return rsl;
    }
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static float dollarToRubleF(float value) {
        float rsl = value * 60;
        return rsl;
    }
    @SuppressWarnings("checkstyle:WhitespaceAround")
    /**
     * Main.
     * @param args - Converter.rubleToEuro - конвертация рублей в евро.
     * @param args - Converter.rubleToDollar - конвертация рублей в доллары.
     * @param args - Converter.rubleToEuroF - конвертация рублей в евро с остатком.
     * @param args - Converter.euroToRuble - конвертация евро в рубли.
     * @param args - Converter.dollarToRuble - конвертация долларов в рубли.
     * @param args - Converter.dollarToRubleF - конвертация долларов с остатком в рубли .
     */
    public static void main(String [] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(300);
        float euroF = Converter.rubleToEuroF(150);
        int rublesE = Converter.euroToRuble(5);
        int rublesD = Converter.dollarToRuble(6);
        float rublesF = Converter.dollarToRubleF(2.5f);
        System.out.println("140 rubles are " + euro + " euro. ");
        System.out.println("300 rubles are " + dollar + " dollar. ");
        System.out.println("150 rubles are " + euroF + " euro. ");
        System.out.println("5 euro are " + rublesE + " rubles. ");
        System.out.println("6 dollar are " + rublesD + " rubles. ");
        System.out.println("2.5 dollar are " + rublesF + " rubles. ");
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        in = 300;
        expected = 5;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("300 rubles are 5 dollar. Test result : " + passed);
        in = 150;
        expected = 2;
        out = rubleToEuro(in);
        passed = expected == out;
        System.out.println("150 rubles are 2 euro. Test result : " + passed);
        in = 5;
        expected = 350;
        out = euroToRuble(in);
        passed = expected == out;
        System.out.println("5 euro are 350 rubles. Test result : " + passed);
        in = 6;
        expected = 360;
        out = dollarToRuble(in);
        passed = expected == out;
        System.out.println("6 dollar are 360 rubles. Test result : " + passed);


    }
}
