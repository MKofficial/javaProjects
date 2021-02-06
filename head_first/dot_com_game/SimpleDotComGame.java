package head_first.dot_com_game;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 26.10.2020
 */
public class SimpleDotComGame {

    public static void main(String[] args) {

        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
