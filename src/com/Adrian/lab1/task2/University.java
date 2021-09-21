package com.Adrian.lab1.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University {
    public String name;
    int foundation;
    List<Student> studentList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void createUniversity() {
        System.out.println("Insert the university name: ");
        name = scanner.nextLine();
        System.out.println("Insert the university foundation year : ");
        foundation = scanner.nextInt();
    }


    public void getAverage() {
        double sum = 0;
        for (Student student : studentList) {
            sum += student.mark;
        }
        double average = sum / studentList.size();
        System.out.println("Average mark at " + name + " is " + average);
    }
}
