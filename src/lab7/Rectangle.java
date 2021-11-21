package lab7;

public class Rectangle implements Figure {
    protected double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public void printDetails() {
        System.out.println("Type = Rectangle");
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
    }
}
