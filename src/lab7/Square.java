package lab7;

public class Square implements Figure {
    protected double length;

    Square(double length){
      this.length = length;
    }
    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public void printDetails()
    {
        System.out.println("Type = Square");
        System.out.println("Length = " + length);
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
    }
}
