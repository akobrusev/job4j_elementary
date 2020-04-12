package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int num = number;
        boolean prime = true;
        for (int index = 1; index <= num; index++) {
             prime = false;
            if ((num % 5) == 0) {
                prime = true;
            }
        }

        return prime;
    }
}

