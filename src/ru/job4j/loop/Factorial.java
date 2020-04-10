package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        int k = 1;
        for (k = 1; k <= n; k++) {
        result = result * k;
        }
        return result;
    }
}
