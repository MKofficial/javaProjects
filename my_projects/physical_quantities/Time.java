package my_projects.physical_quantities;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 15.10.2020
 */
public class Time {
    public static final String name = "Time";
    public static final String nameAbbr = "t";
    public static final String unitName = "Second";
    public static final String unitAbbr = "s";
    private boolean flag;
    public double value;

    Time(int seconds) {
        this.value = seconds;
    }

    Time() {
        this.value = 0;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
