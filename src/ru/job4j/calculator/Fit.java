package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double rsl = 1.15 * (height - 100);
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl = 1.15 * (height - 110);
        return rsl;
    }

    public static double girlWeight(double height) {
        double rsl = 1.15 * (height - 110);
        return rsl;
    }

    public static double boyWeight(double height) {
        double rsl = 1.15 * (height - 100);
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(188);
        double woman = Fit.womanWeight(175);
        double girl = Fit.girlWeight(145);
        double boy = Fit.boyWeight(155);
        System.out.println("Man 188 is " + man + " kg. ");
        System.out.println("Woman 175 is " + woman + " kg. ");
        System.out.println("Girl 145 is " + girl + " kg. ");
        System.out.println("Boy 155 is " + boy + " kg. ");
    }
}
