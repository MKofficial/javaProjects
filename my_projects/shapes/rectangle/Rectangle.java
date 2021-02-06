package my_projects.shapes.rectangle;

import my_projects.shapes.Shape;

/**
 * Subclass of Shape.java creating rectangle
 * @since 2020-23-09
 * @author Matthew Kriz
 * @version 1.1.0
 */

public class Rectangle extends Shape{
    protected double sideA, sideB;

    public Rectangle(double sideA, double sideB) {
        if (sideA <= 0 || sideB <= 0) {
            throw new IllegalArgumentException("Parameter sideA (" + (int) sideA + ") or sideB (" + (int) sideB + ") " +
                                               "has to be bigger than 0");
        }
        name = "Rectangle";
        this.sideA = sideA;
        this.sideB = sideB;
    }

    /**
     * Constructor for square objects
     * @param side Size of side
     */
    protected Rectangle(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Parameter side (" + (int) side + ") has to be bigger than 0");
        }
        name = "Square";
        this.sideA = side;
        this.sideB = side;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return (sideA + sideB) * 2;
    }
}
