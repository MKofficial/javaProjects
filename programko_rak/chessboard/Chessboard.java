package programko_rak.chessboard;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 31/01/2021
 */
public class Chessboard {
    final int[][] fields;
    final int max;

    /**
     * @param max Number of field on chessboard. Also defines it's max position by "max - 1".
     */
    public Chessboard(int max) {
        fields = new int[max][max];
        this.max = max;

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                fields[i][j] = Integer.MAX_VALUE;
            }
        }
    }

    /**
     * Print out current chessboard. If a value of a position is set
     * to Integer.MAX_VALUE then print out "x" instead.
     */
    public void printOutChessboard() {
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                if (fields[i][j] == Integer.MAX_VALUE) {
                    System.out.print("x\t");
                } else {
                    System.out.print(fields[i][j] + "\t");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Chessboard chessboard = new Chessboard(8);
        Bishop bishop = new Bishop(chessboard);
        bishop.allMoves(0, 2, 2);
        chessboard.printOutChessboard();
    }
}
