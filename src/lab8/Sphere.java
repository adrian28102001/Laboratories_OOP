package lab8;

public class Sphere implements GeometricBody {
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4 * (Math.PI * Math.pow(radius, 3))) / 3;
    }

    public void printDetails() {
        System.out.println("Type = Sphere");
        System.out.println("Radius = " + radius);
        System.out.println("Surface = " + getSurface());
        System.out.println("Volume = " + getVolume());
    }
}
