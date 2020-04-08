package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
       int result = first > second && first > third ? first : second;
       result = result < third ? third : result;
       return result;
    }
}