package ru.job4j.array;

import javax.print.DocFlavor;

public class ArrayDefinition {
    public static void main(String [] args) {
        String [] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Anton Kobrusev";
        names[2] = "Dmitiy Moiseev";
        names[3] = "Mark Kobrusev";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
