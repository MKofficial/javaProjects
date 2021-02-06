package my_projects.physical_quantities;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 15.10.2020
 */
public class MagneticInduction {
    public static final String name = "Magnetic induction";
    public static final String nameAbbr = "B";
    public static final String unitName = "Tesla";
    public static final String unitAbbr = "T";
    public double value;

    public MagneticInduction(double value) {
        this.value = value;
    }

    public MagneticInduction() {
        this.value = 0;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
