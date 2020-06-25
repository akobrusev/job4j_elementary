package ru.job4j.tracker;

public class Surgeon extends Doctor {
    private String scalpel;

    public String getScalpel() {
        return scalpel;
    }
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
    }
}
