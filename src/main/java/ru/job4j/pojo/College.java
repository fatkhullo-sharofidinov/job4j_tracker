package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Sharofidinov Fatkhullo Shukrilloevich");
        student.setGroup("Stazher");
        student.setAdmission(new Date());

        System.out.println("Student " + student.getFio() + " entered to course in " + student.getAdmission() + " to group " + student.getGroup());
    }
}
