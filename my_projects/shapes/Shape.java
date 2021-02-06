package my_projects.shapes;

/**
 * Superclass and abstract one Shape.java
 * @since 2020-23-09
 * @author Matthew Kriz
 * @version 1.0.2
 */

abstract public class Shape {
    protected String name;
    protected double area, perimeter;

    /**
     * Constructor Shape() sets name of the shape to "undefined", area to 0 and perimeter to 0.
     * All 3 attr can be changed by user using setters.
     */
    public Shape() {
        this.name = "undefined";
        this.area = 0;
        this.perimeter = 0;
    }

    /**
     * Method displaying useful information about an object.
     * Printing to console name of shape, area and perimeter.
     */
    public void printInformation() {
        System.out.println("Name: " + name);
        System.out.println("Area: " + (area != 0 ? area : "not set"));
        System.out.println("Perimeter: " + (perimeter != 0 ? perimeter : "not set"));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public abstract double area();
    public abstract double perimeter();
}
