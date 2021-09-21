package com.Adrian.lab1.task1;



public class Main {
    public static void main(String[] args) {

        Monitor monitor1 = new Monitor();
        Monitor monitor2 = new Monitor();
        Monitor monitor3 = new Monitor();

        Monitor.ReadData(monitor1, monitor2);
        Monitor.CompareSpecs(monitor1, monitor2);

    }

}
