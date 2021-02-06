package my_projects.shapes;

/**
 * Subclass of Shape.java creating circle.
 * @since 2020-26-09
 * @author Matthew Kriz
 * @version 1.0.0
 */

public class Circle extends Shape{
    private final double radius;

    Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Parameter radius (" + (int) radius + ") has to be bigger than 0");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
