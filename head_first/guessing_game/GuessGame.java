package head_first.guessing_game;

import head_first.guessing_game.Player;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 25.10.2020
 */
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int p1Guess = 0;
        int p2Guess = 0;
        int p3Guess = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            p1Guess = p1.number;
            System.out.println("Player one guessed " + p1Guess);
            p2Guess = p2.number;
            System.out.println("Player two guessed " + p2Guess);
            p3Guess = p3.number;
            System.out.println("Player three guessed " + p3Guess);

            if (p1Guess == targetNumber) {
                p1IsRight = true;
            }
            if (p2Guess == targetNumber) {
                p2IsRight = true;
            }
            if (p3Guess == targetNumber) {
                p3IsRight = true;
            }

            if (p1IsRight || p2IsRight || p3IsRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1IsRight);
                System.out.println("Player two got it right? " + p2IsRight);
                System.out.println("Player three got it right? " + p3IsRight);
                System.err.println("Game is over");
                break; // game over, so break out of the loop
            } else {
                // we must keep going because nobody got it right!
                System.out.println("Player will have to try again.");
                System.out.println("------------------------------");
            } // end if/else
        } // end loop
    } // end method
} //end class

