package ru.job4j.tracker;

public class Builder extends Engineer {

    private String helmet;

    public String getHelmet() {
        return helmet;
    }

    public static void main(String[] args) {
        Builder builder = new Builder();
    }
}