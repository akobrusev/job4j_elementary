package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
       int year = 1;
       double p = percent * 0.01;
       double n = amount + amount * p;
        while (n - salary >= 0) {
            n = (n - salary) + (n - salary) * p;
            year += 1;
        }
        return year;
    }
}
