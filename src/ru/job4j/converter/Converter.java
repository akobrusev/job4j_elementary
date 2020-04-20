package ru.job4j.converter;
/**
 * Класс для конвертации рубли/евро и рубли/доллар
 * @author Anton Kobrusev (akobrusev@gmail.com)
 * @since 20.04.2020
 */
public class Converter {
    /**
     * Метод конвертации рублей в евро
     * @param value водные данные, колличество рублей
     * @return возврат результата, (деление рублей на курс, получаем Евро)
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70; // формула перевода рублей в евро
        return rsl;
    }
    /**
     * Метод конвертации рублей в доллар
     * @param value водные данные, колличество рублей
     * @return возврат результата, (деление рублей на курс, получаем Доллар)
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллар
        return rsl;
    }
    /**
     * Метод конвертации рублей в евро с плавающей запятой
     * @param value водные данные, колличество рублей
     * @return возврат результата, (деление рублей на курс, получаем Евро)
     */
    public static float rubleToEuroF(float value) {
        float rsl = value / 70; // формула перевода рублей в евро
        return rsl;
    }
    /**
     * Метод конвертации евро в рубли с плавающей запятой
     * @param value водные данные, колличество Евро
     * @return возврат результата, (умножение евро на курс, получаем Рубли)
     */
    public static int euroToRuble(int value) {
        int rsl = value * 70; // формула перевода евро в рубли
        return rsl;
    }
    /**
     * Метод конвертации доллар в рубли с плавающей запятой
     * @param value водные данные, колличество Доллар
     * @return возврат результата, умножение рублй на курс, получаем Рубли
     */
    public static int dollarToRuble(int value) {
        int rsl = value * 60; // формула превода доллар в рубли
        return rsl;
    }

    public static float dollarToRubleF(float value) {
        float rsl = value * 60;
        return rsl;
    }
    /**
     * Конвертация разной валюты в рубли и обратно.
     * @param args - Converter.rubleToEuro - конвертация рублей в евро.
     * @param args - Converter.rubleToDollar - конвертация рублей в доллары.
     * @param args - Converter.rubleToEuroF - конвертация рублей в евро с остатком.
     * @param args - Converter.euroToRuble - конвертация евро в рубли.
     * @param args - Converter.dollarToRuble - конвертация долларов в рубли.
     * @param args - Converter.dollarToRubleF - конвертация долларов  в рубли с остатком.
     */
    public static void main(String [] args) {
        int euro = Converter.rubleToEuro(140); // конвертация рублей в евро.
        int dollar = Converter.rubleToDollar(300); // конвертация рублей в доллары.
        float euroF = Converter.rubleToEuroF(150); // конвертация рублей в евро с остатком (плавающая запятая).
        int rublesE = Converter.euroToRuble(5); // конвертация евро в рубли.
        int rublesD = Converter.dollarToRuble(6); // конвертация долларов в рубли.
        float rublesF = Converter.dollarToRubleF(2.5f); // конвертация долларов в рубли с остатком (плавающая запятая).
        System.out.println("140 rubles are " + euro + " euro. "); // вывод результата
        System.out.println("300 rubles are " + dollar + " dollar. "); // вывод результата
        System.out.println("150 rubles are " + euroF + " euro. "); // вывод результата
        System.out.println("5 euro are " + rublesE + " rubles. "); // вывод результата
        System.out.println("6 dollar are " + rublesD + " rubles. "); // вывод результата
        System.out.println("2.5 dollar are " + rublesF + " rubles. "); // вывод результата
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed); // вывод проверки результата
        in = 300;
        expected = 5;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("300 rubles are 5 dollar. Test result : " + passed); // вывод проверки результата
        in = 150;
        expected = 2;
        out = rubleToEuro(in);
        passed = expected == out;
        System.out.println("150 rubles are 2 euro. Test result : " + passed); // вывод проверки результата
        in = 5;
        expected = 350;
        out = euroToRuble(in);
        passed = expected == out;
        System.out.println("5 euro are 350 rubles. Test result : " + passed); // вывод проверки результата
        in = 6;
        expected = 360;
        out = dollarToRuble(in);
        passed = expected == out;
        System.out.println("6 dollar are 360 rubles. Test result : " + passed); // вывод проверки результата
    }
}
