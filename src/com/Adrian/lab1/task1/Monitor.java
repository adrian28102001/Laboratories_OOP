package com.Adrian.lab1.task1;

import java.util.Scanner;

public class Monitor {
    public String color = "";
    public String resolution = "";
    public double dimension = 0;


    public static void ReadData(Monitor monitor1,Monitor monitor2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give your monitor1's color");
        monitor1.color = scanner.nextLine();
        System.out.println("Give your monitor1's resolution (use x or X)");
        monitor1.resolution = scanner.nextLine();
        System.out.println("Give your monitor1's dimension (inches)");
        monitor1.dimension = scanner.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Give your monitor2's color");
        monitor2.color = scanner2.nextLine();
        System.out.println("Give your monitor2's resolution (use x or X)");
        monitor2.resolution = scanner2.nextLine();
        System.out.println("Give your monitor2's dimension (inches)");
        monitor2.dimension = scanner2.nextDouble();
    }
    public static void CompareSpecs(Monitor monitor1, Monitor monitor2) {
        boolean monitorColor;
        boolean monitorResolution;

        monitorColor = monitor1.color.equalsIgnoreCase(monitor2.color); //ignores case sensitive
        monitorResolution = monitor1.resolution.equalsIgnoreCase(monitor2.resolution);

        if (monitorColor) {
            System.out.println("They are the same color: \"" + monitor1.color + "\"");
        } else {
            System.out.println("Monitor1 color is \"" + monitor1.color + " \" while Monitor2 is \"" + monitor2.color + "\"");
        }
        if (monitorResolution) {
            System.out.println("They are the same resolution " + monitor1.resolution + "\"");
        } else {
            System.out.println("Monitor1 resolution is \"" + monitor1.resolution + "\" while Monitor2 is \"" + monitor2.resolution + "\"");
        }
        if (monitor1.dimension == monitor2.dimension) {
            System.out.println("They are the same dimensions \"" + +monitor1.dimension + "\"");
        } else {
            System.out.println("Monitor1 dimension is \"" + monitor1.dimension + "\" while Monitor2 is \"" + monitor2.dimension + "\"");
        }
    }
}
