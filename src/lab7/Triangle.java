package lab7;

public class Triangle implements Figure{
    protected double a,b,c;

    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getArea() {
        double sum;
        sum = (a+b+c)/2;
        return Math.sqrt(sum*(sum-a)*(sum-b)*(sum-c));
    }

    @Override
    public double getPerimeter() {
        return (a+b+c);
    }

    @Override
    public void printDetails()
    {
        System.out.println("Type = Triangle");
        System.out.println("Side a = " + a);
        System.out.println("Side b = " + b);
        System.out.println("Side c = " + c);
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
    }
}
