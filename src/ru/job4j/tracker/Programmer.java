package ru.job4j.tracker;

public class Programmer extends Engineer {

    private String allowance;

    public String getAllowance() {
        return allowance;
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
    }
}
