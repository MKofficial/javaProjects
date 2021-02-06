package my_projects.physical_quantities;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 15.10.2020
 */
public class Permeability {
    public static final double vacuumPermeability = 4 * Math.PI * Math.pow(10, -7);

    public static final String name = "Permeability";
    public static final String nameAbbr = "μ";
    public static final String unitName = "Newton per Ampere(-2)";
    public static final String unitAbbr = "Hm(-1)";
    private boolean flag;
    public double value;

    Permeability(double permeability) {
        this.value = permeability / vacuumPermeability;
    }

    Permeability() {
        this.value = vacuumPermeability;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    //todo: two units: how the value changes if the unit changes
}
