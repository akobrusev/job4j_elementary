package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double step1 = p * (p - a) * (p - b) * (p - c);
        double s = Math.sqrt(step1);
       return s;
    }

    public static void main(String[]args) {
        double s = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = "  + s);
        s = TrgArea.area(3,5,7);
        System.out.println("area (3, 5, 7) = " + s);
    }

}
