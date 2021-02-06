package my_projects.physical_quantities;

import my_projects.shapes.Angle;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 15.10.2020
 *
 */
public class MagneticField {

    /**
     * Method counting magnetic power
     * @param B Magnetic induction
     * @param I Electric current
     * @param l Length
     * @return Value of magnetic power
     */
    public static double countMagneticPower(MagneticInduction B, ElectricCurrent I, double l) {
        return B.getValue() * I.getValue() * l;
    }

    /**
     * Method counting magnetic power
     * @param B Magnetic induction
     * @param e Electric current
     * @param v Length
     * @return Value of magnetic power
     */
    public static double countMagneticPower(MagneticInduction B, double e, double v) {
        return B.getValue() * e * v;
    }

    /**
     * Method counting magnetic power
     * @param B Magnetic induction
     * @param I Electric current
     * @param l Length
     * @param alfa Angle between magnetic induction and plane normal
     * @return Value of magnetic power
     */
    public static double countMagneticPower(MagneticInduction B, ElectricCurrent I, double l, Angle alfa) {
        return B.getValue() * I.getValue() * l * Math.sin(alfa.getFullSize());
    }

    /**
     * Method counting magnetic induction
     * @param mi Default permeability
     * @param I Electric current
     * @param l Length
     * @return Value of magnetic induction
     */
    public static double countMagneticInduction(Permeability mi, ElectricCurrent I, double l) {
        return mi.getValue() * (I.getValue() / (2 * Math.PI * l));
    }

    /**
     * Method counting magnetic induction with screw-threads
     * @param mi Default permeability
     * @param N Number of screw-threads
     * @param I Electricity current
     * @param l Length
     * @return Value of magnetic induction
     */
    public static double countMagneticInduction(Permeability mi, double N, ElectricCurrent I, double l) {
        return mi.getValue() * (N * I.getValue() / l);
    }

    /**
     * Method counting magnetic induction flux
     * @param B Magnetic induction
     * @param S An area
     * @param alfa An angle between magnetic induction and plane normal
     * @return Value of magnetic induction flux
     */
    public static double countMagneticInductionFlux(MagneticInduction B, double S, Angle alfa) {
        return B.getValue() * S * Math.cos(alfa.getFullSize());
    }

    /**
     * Method counting magnetic induction flux
     * @param L Coil inductance
     * @param I Electric current
     * @return Value of magnetic induction flux
     */
    public static double countMagneticInductionFlux(double L, ElectricCurrent I) {
        return L * I.getValue();
    }

    /**
     * Method counting magnetic induction flux during harmonic process
     * @param B Magnetic induction
     * @param S An area
     * @param omega An angular speed
     * @param t Time
     * @return Value of magnetic induction flux
     */
    public static double countMagneticInductionFlux(MagneticInduction B, double S, Angle omega, Time t) {
        return B.getValue() * S * Math.cos(omega.getFullSize()) * t.getValue();
    }

    /**
     * Method counting induced electromotive voltage
     * @param fi Magnetic induction flux
     * @param t Time
     * @return Value of induced electromotive voltage
     */
    public static double countInducedElectromotiveVoltage(MagneticInductionFlux fi, Time t) {
        return -(fi.getValue() / t.getValue());
    }

    public static double countInducedElectromotiveVoltage(MagneticInductionFlux fi, Time t, double N) {
        return -(N * fi.getValue() * t.getValue());
    }

    /**
     * Method counting induced electromotive voltage
     * @param L Coil inductance
     * @param I Electric current
     * @param t Time
     * @return Value of induced electromotive voltage
     */
    public static double countInducedElectromotiveVoltage(double L, ElectricCurrent I, Time t) {
        return -(L * I.getValue() / t.getValue());
    }

    public static double countInductance(MagneticInductionFlux fi, double I) {
        return fi.getValue() / I;
    }
    public static double countInductance(double Ui, Time t, ElectricCurrent I) {
        return (Ui * t.getValue()) / I.getValue();
    }

    /**
     * Method counting alternating voltage
     * @param Um Voltage
     * @param omega An angular speed
     * @param t Time
     * @return Value of alternating voltage
     */
    public static double countAlternatingVoltage(double Um, Angle omega, Time t) {
        return Um * Math.sin(omega.getFullSize()) * t.getValue();
    }

    /**
     * Method counting induced electricity
     * @param Ui Induced electromotive voltage
     * @param R Resistance
     * @return Value of induced electricity
     */
    public static double inducedElectricCurrent(double Ui, double R) {
        return Ui / R;
    }

    public static double countPermeability(MagneticInduction B, double H) {
        return B.getValue() / H;
    }
}
