package lab8;

public class Parallelepiped implements GeometricBody {
    double a, b, c;

    Parallelepiped(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getSurface() {
        return 2 * (a * b + a * c + b * c);
    }

    @Override
    public double getVolume() {
        return a * b * c;
    }

    public void printDetails() {
        System.out.println("Type = Parallelepiped");
        System.out.println("Side a = " + a);
        System.out.println("Side b = " + b);
        System.out.println("Side c = " + c);
        System.out.println("Surface = " + getSurface());
        System.out.println("Volume = " + getVolume());
    }
}
