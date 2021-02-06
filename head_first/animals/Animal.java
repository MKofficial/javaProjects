package head_first.animals;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 27.10.2020
 */
public abstract class Animal {
    String food;
    int hunger;
    double[] boundaries;

    public abstract void makeNoise();
    public abstract void eat();
    public abstract void sleep();
    public abstract void roam();
}
