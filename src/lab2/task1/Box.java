package lab2.task1;

public class Box {
    double height = 1;
    double width = 1;
    double depth = 1;

    public Box(){
    }
    public Box(double height){
        this.height = height;
        depth = height;
        width = height;
    }
    public Box(double height, double width, double depth){
        this.height = height;
        this.depth = width;
        this.width = depth;
    }
    public void area() {
        double resultA = 2 * (height * width) + 2 * (height * depth) + 2 * (width * depth);
        System.out.println("Area for a cube with " + width + " width " + height + " height " + depth + " depth is: " + resultA);
    }

    public void volume() {
        double resultV = height * width * depth;
        System.out.println("Volumea for a cube with " + width + " width " + height + " height " + depth + " depth is: " + resultV);
    }
}
