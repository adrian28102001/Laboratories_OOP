package com.Adrian.lab1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("The following program will ask you for 3 universities and the number");
        System.out.println("of students students per each university and then will compute average per university \n");
        System.out.println("P.S Everything in ths program is done using the keyboard");

        Scanner scanner = new Scanner(System.in);
        University university1 = new University();
        University university2 = new University();
        University university3 = new University();

        university1.createUniversity();
        System.out.println("How many student's will be in " + university1.name);
        int nrOfStudents1 = scanner.nextInt();

        for (int i = 0; i < nrOfStudents1; i++) {
            Student student = new Student();
            student.createStudent();
            university1.studentList.add(student);
        }

        university2.createUniversity();
        System.out.println("How many student's will be in " + university2.name);
        int nrOfStudents2 = scanner.nextInt();

        for (int i = 0; i < nrOfStudents2; i++) {
            Student student = new Student();
            student.createStudent();
            university2.studentList.add(student);
        }

        university3.createUniversity();
        System.out.println("How many student's will be in " + university3.name);
        int nrOfStudents3 = scanner.nextInt();

        for (int i = 0; i < nrOfStudents3; i++) {
            Student student = new Student();
            student.createStudent();
            university3.studentList.add(student);
        }

        university1.getAverage();
        university2.getAverage();
        university3.getAverage();
    }
}
