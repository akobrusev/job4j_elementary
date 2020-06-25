package ru.job4j.tracker;

public class Doctor extends Profession {

    private String medicaldegree;

    public String getMedicaldegree() {
        return medicaldegree;
    }
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
    }
}
