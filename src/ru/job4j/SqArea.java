package ru.job4j;
    public class SqArea {
        public static double square(int p, int k) {
            double step1 = k + 1;
            double step2 = step1 * 2;
            double h = p / step2;
            double L = h * k;
            double result = L * h;
            return result;

        }
        public static void main(String[] args) {
            double result = SqArea.square(6, 2);
            System.out.println(" p = 6, k = 2, s = 2, real = " + result);
            result = SqArea.square(10, 4);
            System.out.println(" p = 10, k = 4, s = 4, real = " + result);
        }

    }


