package ru.job4j.tracker;

public class Engineer extends Profession {

    private String specialty;

    private String discharge;

    public String getSpecialty() {
        return specialty;
    }

    public String getDischarge() {
        return discharge;
    }

    public static void main(String[] args) {
        Engineer engineer = new Engineer();
    }
}
