package my_projects.shapes;

/**
 * Class for creating angles
 * @author Matthew Kriz
 * @version 1.1.0
 * @since 07.10.2020
 */
public class Angle {
    private int degree, minute, second;

    /**
     * Constructor for creating angles
     * @param size Size of angle
     */
    public Angle(double size) {
        this.degree = (int) size;
        this.minute = (int) ((size - (int) size) * 60);
        this.second = (int) ((((size - (int) size) * 60) - (int) ((size - (int) size) * 60)) * 60);
    }

    /**
     * Constructor for creating angles
     * Minute and second is set to 0
     * @param degree Degree size of angle
     */
    public Angle(int degree) {
        this(degree, 0, 0);
    }

    /**
     * Constructor for creating angles
     * Second is set to 0
     * @param degree Degree size of angle
     * @param minute Minute size of angle
     */
    public Angle(int degree, int minute) {
        this(degree, minute, 0);
    }

    /**
     * Constructor for creating angles
     * @param degree Degree size of angle
     * @param minute Minute size of angle
     * @param second Second size of angle
     */
    public Angle(int degree, int minute, int second) {
        this.degree = degree;
        this.minute = minute;
        this.second = second;
    }

    /**
     * Method printing out information about an angle
     */
    public void printInformation() {
        System.out.println("Angle\n");
        System.out.printf("Degree: %5d°%n", degree);
        System.out.printf("Minute: %5d'%n", minute);
        System.out.printf("Second: %5d\"%n", second);
    }

    /**
     * Method converting radians to degrees and writing it to triangle fields
     * @param value Size of angle in rad
     */
    public void convertRadToDegree(double value) {
        final double radConst = 57.2957795;
        double size = value * radConst;
        this.degree = (int) size;
        this.minute = (int) ((size - (int) size) * 60);
        this.second = (int) ((((size - (int) size) * 60) - (int) ((size - (int) size) * 60)) * 60);
    }

    /**
     * Method checking if angle is greater than 90 degrees and setting new values to triangle fields
     */
    public void getConvexAngle() {
        if (degree > 180) {
            this.second = 60 - second;
            this.minute = 60 - minute - 1;
            this.degree = 360 - degree - 1;
        }
    }

    /**
     * Method getting full size of angle
     * It transfer minutes and seconds to degree
     * @return Degree size as decimal number
     */
    public double getFullSize() {
        return (double) (minute + second / 60) / 60 + degree;
    }

    public int getDegree() {
        return degree;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}

