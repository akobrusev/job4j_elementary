package ru.job4j.tracker;

public class Dentist extends Doctor {
    private String drill;

    public String getDrill() {
        return drill;
    }
    public static void main(String[] args) {
        Dentist dentist = new Dentist();
    }
}
