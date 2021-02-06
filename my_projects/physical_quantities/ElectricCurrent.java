package my_projects.physical_quantities;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 15.10.2020
 */
public class ElectricCurrent {
    public static final String name = "Electric Current";
    public static final String nameAbbr = "I";
    public static final String unitName = "Ampere";
    public static final String unitAbbr = "A";
    private boolean flag;
    public double value;


    public ElectricCurrent(double value) {
        this.value = value;
    }

    public ElectricCurrent() {
        this.value = 0;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
