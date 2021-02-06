package head_first.guessing_game;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 25.10.2020
 */
public class Player {
    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
