package lab8;

public class Cub implements GeometricBody {
    protected double length;

    Cub(double length) {
        this.length = length;
    }

    @Override
    public double getSurface() {
        return 6 * Math.pow(length, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(length, 3);
    }

    public void printDetails() {
        System.out.println("Type = Cub");
        System.out.println("Length = " + length);
        System.out.println("Surface = " + getSurface());
        System.out.println("Volume = " + getVolume());
    }
}
