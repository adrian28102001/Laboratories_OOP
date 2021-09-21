package com.Adrian.lab1.task2;
import java.util.Scanner;

public class Student {
    String name;
    int age;
    public double mark;
    Scanner scanner = new Scanner(System.in);

    public void createStudent() {
        System.out.println("Insert the student's name");
        name = scanner.nextLine();
        System.out.println("Insert the  student's age");
        age = scanner.nextInt();
        System.out.println("Insert the  student's mark");
        mark = scanner.nextInt();

    }
}
