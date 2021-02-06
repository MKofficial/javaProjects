package my_projects.shapes.triangle;

import my_projects.shapes.Shape;

/**
 * Abstract subclass of Shape.java not implementing abstract method area(), because there are many ways to count it.
 * @since 2020-23-09
 * @author Matthew Kriz
 * @version 1.0.2
 */   

public abstract class Triangle extends Shape {
    final private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("Parameters sideA (" + (int) sideA + "), sideB (" + (int) sideB + ") or " +
                    "sideC (" + sideC + ") have to be bigger than 0");
        }
        name = "Triangle";
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
