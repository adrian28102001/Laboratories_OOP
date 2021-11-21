package lab7;

import java.util.ArrayList;
import java.util.List;

import static lab7.FigureController.biggestArea;
import static lab7.FigureController.biggestPerimeter;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(3);
        Rectangle rectangle = new Rectangle(1.4, 4.6);
        Triangle triangle = new Triangle(3, 5, 7);
        Figure circle = new Figure() { //the anonymous class

            double radius = 1;

            @Override
            public double getArea() {
                return Math.PI * radius * radius;
            }

            @Override
            public double getPerimeter() {
                return 2 * Math.PI * radius;
            }

            @Override
            public void printDetails() {
                System.out.println("Type = Circle");
                System.out.println("Radius = " + radius);
                System.out.println("Area = " + getArea());
            }
        };

        List<Figure> figures = new ArrayList<>(); //list of figures
        figures.add(square);
        figures.add(rectangle);
        figures.add(triangle);
        figures.add(circle);

        biggestArea(figures);
        System.out.println("\n");
        biggestPerimeter(figures);
    }
}

