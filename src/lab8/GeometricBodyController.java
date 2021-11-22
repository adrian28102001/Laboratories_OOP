package lab8;

import java.util.List;

public class GeometricBodyController {
    public static void biggestVolume(List<GeometricBody> geometricBodies) {
        GeometricBody largest = geometricBodies.get(0);
        for (GeometricBody value : geometricBodies) {
            if (value.getVolume() > largest.getVolume()) {
                largest = value;
            }
        }
        System.out.println("The details of the shape with largest volume are :");
        largest.printDetails();
    }

    public static void biggestSurface(List<GeometricBody> geometricBodies) {
        GeometricBody largest = geometricBodies.get(0);
        for (GeometricBody value : geometricBodies) {
            if (value.getSurface() > largest.getSurface()) {
                largest = value;
            }
        }
        System.out.println("The details of the shape with largest surface are :");
        largest.printDetails();
    }
}
