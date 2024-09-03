package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Щелочков Дмитрий");
        student.setGroup(1);
        student.setAdmission(new Date());
        System.out.println("Студент " + student.getName() + " зачислен в группу № " + student.getGroup() + " дата приема " + student.getAdmission());

    }
}
