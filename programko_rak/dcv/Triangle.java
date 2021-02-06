package programko_rak.dcv;

import my_projects.shapes.Angle;

/**
 * @author Matthew Kriz
 * @version 1.2.1
 * @since 07.10.2020
 */
public class Triangle {
    private double sideA, sideB, sideC;
    private String name;
    private String units = "m";

    /**
     * Constructor for equilateral triangle
     * @param side Size of sides in meters
     */
    public Triangle(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side has to be grater than 0");
        }
        name = "Equilateral triangle";
        this.sideA = side;
        this.sideB = side;
        this.sideC = side;
    }

    /**
     * Constructor for isosceles triangle
     * @param base Size of the smallest side called base in this type of triangle (in meters)
     * @param hanger Size of the largest sides called hanger in this type of triangle (in meters)
     */
    public Triangle(double base, double hanger) {
        if (hanger * 2 < base || base <= 0 || hanger <= 0 ) {
            throw new IllegalArgumentException("Sides have to be greater than 0 and base has to be grater than sum " +
                                               "of 2 hangers");
        }
        name = "Isosceles triangle";
        this.sideA = base;
        this.sideB = hanger;
        this.sideC = hanger;
    }

    /**
     * Constructor for general triangle
     * @param sideA Size of side A in meters
     * @param sideB Size of side B in meters
     * @param sideC Size of side C in meters
     */
    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("Sides have to be grater than 0");
        } else if (sideA + sideB < sideC || sideB + sideC < sideA || sideA + sideC < sideB) {
            throw new IllegalArgumentException("Sum of 2 sides have to be grater than the other one");
        }
        name = "General triangle";
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * Constructor for triangle where we know only two sides and one angle is 90°
     * @param sideA One size of triangle (in meters)
     * @param sideB Second size of triangle (in meters)
     * @param missingHypotenuse If it is set true, triangle misses the largest side
     */
    public Triangle(double sideA, double sideB, boolean missingHypotenuse) {
        if (sideA <= 0 || sideB < 0) {
            throw new IllegalArgumentException("Sides have to be grater than 0");
        }
        name = "Right triangle";
        this.sideA = sideA;
        this.sideB = sideB;

        if (missingHypotenuse) {
            this.sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        } else {
            this.sideC = Math.sqrt(Math.abs(Math.pow(sideA, 2) - Math.pow(sideB, 2)));
        }
    }

    /**
     * Constructor for triangle where we know all angles and only one side
     * @param side Size of one side
     * @param leftAdjacentAngle my_projects.shapes.Angle which is on the left of @param side
     * @param rightAdjacentAngle my_projects.shapes.Angle which is on the right of @param side
     * @param oppositeAngle my_projects.shapes.Angle which does not adjacent with @param side
     */
    public Triangle(double side, Angle leftAdjacentAngle, Angle rightAdjacentAngle, Angle oppositeAngle) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side has to be grater than 0");
        }
        name = "General triangle";
        sideA = side;
        sideB = side * Math.sin(rightAdjacentAngle.getFullSize()) / Math.sin(leftAdjacentAngle.getFullSize());
        sideC = side * Math.sin(oppositeAngle.getFullSize()) / Math.sin(leftAdjacentAngle.getFullSize());

        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            name = "Unknown triangle"; sideA = 0; sideB = 0; sideC = 0;
            throw new IllegalArgumentException("Triangle does not exist");
        }
    }

    /**
     * Method printing out information about a triangle
     */
    public void printInformation() {
        System.out.printf("Triangle: %s %n%n", name);
        System.out.printf("SideA: %15.2f %s%n", sideA, units);
        System.out.printf("SideB: %15.2f %s%n", sideB, units);
        System.out.printf("SideC: %15.2f %s%n", sideC, units);
        System.out.printf("Perimeter: %11.2f %s%n", perimeter(), units);
        System.out.printf("Area: %16.2f %s^2%n", area(), units);
    }

    /**
     * Method counting perimeter of a triangle
     * @return Perimeter of triangle
     */
    private double perimeter() {
        return sideA + sideB + sideC;
    }

    /**
     * Method counting area of a triangle with Heron's formula
     * @return Area of triangle
     */
    private double area() {
        double param = (sideA + sideB + sideC) / 2;
        return Math.sqrt(param * (param - sideA) * (param - sideB) * (param - sideC));
    }

    /**
     * Method counting area of a triangle with known height to one side
     * @param height Size of height to @param side in meters
     * @param side Size of side in meters
     * @return Area of triangle
     */
    // This method should be asymptotically memory and asymptotically temporally faster (?)
    private double area(double height, double side) {
        return (height * side) / 2;
    }

    /**
     * Method that change units from meters to centimeters
     */
    private void changeUnitMToCm() {
        if (units.equals("cm")) {
            System.err.println("Cannot change units, you already have them");
        } else if (!units.equals("m")) {
            throw new IllegalStateException("Cannot change units, your units do not coincide with this king of " +
                                            "operation");
        } else {
            units = "cm";
            sideA *= 100;
            sideB *= 100;
            sideC *= 100;
        }
    }

    /**
     * Method that change units from centimeters to meters
     */
    private void changeUnitCmToM() {
        if (units.equals("m")) {
            System.err.println("Cannot change units, you already have them");
        } else if (!units.equals("cm")){
            throw new IllegalStateException("Cannot change units, your units do not coincide with this king of " +
                                            "operation");
        } else {
            units = "m";
            sideA /= 100;
            sideB /= 100;
            sideC /= 100;
        }
    }

    /**
     * Method that change units to your owns
     * Increasing or decreasing the value by @param num and @param less
     * @param unit Name of the units
     * @param num Number which increase or decrease the origin size of sides
     * @param less If it is true than the new unit is less than the origin one
     */
    private void changeUnit(String unit, double num, boolean less) {
        units = unit;
        if (less) {
            sideA *= num;
            sideB *= num;
            sideC *= num;
        } else {
            sideA /= num;
            sideB /= num;
            sideC /= num;
        }
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}