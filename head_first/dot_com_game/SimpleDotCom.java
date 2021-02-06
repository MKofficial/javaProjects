package head_first.dot_com_game;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 26.10.2020
 */
public class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits;

    String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            } // end if
        } // end for

        if (numOfHits == locationCells.length) {
            result = "kill";
        } // end if

        System.out.println(result);
        return result;
    }

    void setLocationCells(int[] loc) {
        locationCells = loc;
    }
}
