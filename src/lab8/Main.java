package lab8;

import java.util.ArrayList;
import java.util.List;

import static lab8.GeometricBodyController.biggestSurface;
import static lab8.GeometricBodyController.biggestVolume;

public class Main {
    public static void main(String[] args) {

        Cub cub = new Cub(3);
        Sphere sphere = new Sphere(1);
        Parallelepiped parallelepiped = new Parallelepiped(2, 3, 4);

        List<GeometricBody> geometricBodies = new ArrayList<>(); //list of figures
        geometricBodies.add(cub);
        geometricBodies.add(sphere);
        geometricBodies.add(parallelepiped);

        biggestVolume(geometricBodies);
        biggestSurface(geometricBodies);
    }
}
