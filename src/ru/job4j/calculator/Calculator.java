package ru.job4j.calculator;

public class Calculator {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result );
    }
    public static void main(String [] args) {
        Calculator.plus(500, 100);
        Calculator.plus(4, 2);
        Calculator.plus(5, 3);
    }
}
