public class Triangle extends GeometricObject {

    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    // A no-arg constructor that creates a default triangle.
    public Triangle() {
        super("", false);
    }

    // A constructor that creates a rectangle with the specified side1, side2, and side3.
    public Triangle(double a, double b, double c) {
        super("", false);
        side1 = a;
        side2 = b;
        side3 = c;
    }

    // The accessor methods for all three data fields.
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // A method named getArea() that returns the area of this triangle.
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    //A method named getPerimeter() that returns the perimeter of this triangle.
    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

}