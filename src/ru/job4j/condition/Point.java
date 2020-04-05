package ru.job4j.condition;

public class Point {
    public static double distance (int x1, int y1, int x2, int y2){
        double x = x2 - x1;
        double y = y2 - y1;
        double xx = Math.pow(x, 2);
        double yy = Math.pow(y, 2);
        double xy = xx + yy;
        double result = Math.sqrt(xy);
        return result;
    }
        public static void main (String [] args){
        double result = Point.distance(0, 0, 2, 0);
        System.out.println(" result (0, 0) to (2, 0) " + result);
        result = Point.distance(2,5,6,8);
        System.out.println(" result (0, 2) to (6, 8) " + result);
        result = Point.distance(4, 5, 0, 10);
        System.out.println(" result (4, 5) to (0, 10) " + result);
    }

}
