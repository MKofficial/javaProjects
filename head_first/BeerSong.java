package head_first;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 25.10.2020
 */
public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

            if (beerNum == 1) {
                word = "bottle"; //singular as we have only one bottle
            }

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            } //end else
        } //end while loop
    } //end main method
} // end class
