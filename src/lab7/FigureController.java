package lab7;


import java.util.List;

public class FigureController {

    public static void biggestArea(List<Figure> figure) {
        Figure largest = figure.get(0);
        for (Figure value : figure) {
            if (value.getArea() > largest.getArea()) {
                largest = value;
            }
        }
        System.out.println("The details of the shape with largest area are :");
        largest.printDetails();
    }

    public static void biggestPerimeter(List<Figure> figure) {
        Figure largest = figure.get(0);
        for (Figure value : figure) {
            if (value.getPerimeter() > largest.getPerimeter()) {
                largest = value;
            }
        }
        System.out.println("The details of the shape with largest perimeter are :");
        largest.printDetails();
    }
}
