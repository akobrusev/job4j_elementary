package ru.job4j.pojo;

import java.util.Date;

public class College {


    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Anton");
        student.setSirname("Kobrusev ");
        student.setGroup("GGU2003");
        student.setDateOfReceipt(new Date(2003, 07, 17));

        System.out.println(student.getName() + " " + student.getSirname() + " joined the group " + " : " + student.getGroup() +  " in " + student.getDateOfReceipt());
        }
}
