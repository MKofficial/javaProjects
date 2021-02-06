package my_projects.physical_quantities;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 15.10.2020
 */
public class MagneticInductionFlux {
    public static final String name = "Magnetic induction flux";
    public static final String nameAbbr = "Φ";
    public static final String unitName = "Weber";
    public static final String unitAbbr = "Wb";
    private boolean flag;
    public double value;

    MagneticInductionFlux(double value) {
        this.value = value;
    }

    MagneticInductionFlux() {
        this.value = 0;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
