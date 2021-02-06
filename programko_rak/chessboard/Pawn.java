package programko_rak.chessboard;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 01/02/2021
 */
public class Pawn {
    private final Chessboard chessboard;
    private final int row;
    private final int column;
    private final String color;
    /**
     * @param chessboard Select a chessboard to place a knight
     * @param row        X position on which a knight will be placed
     * @param column     Y position on which a knight will be placed
     * @param color      Select a color for pawn. ONLY "white" or "black" is possible!
     */
    public Pawn(Chessboard chessboard, int row, int column, String color) {
        this.chessboard = chessboard;
        this.color = color;
        this.row = row;
        this.column = column;
    }

    public Pawn(Chessboard chessboard, int row, int column) {
        this(chessboard, row, column, "white");
    }

    public void allMoves(int move, int row, int column) {
        if (row < 0 || column < 0 || row >= chessboard.max || column >= chessboard.max || move >= chessboard.fields[row][column]) {
            return;
        }
        chessboard.fields[row][column] = move;
        move++;

        if (color.equals("black")) {
            allMoves(move, row + 1, column);
        } else if (color.equals("white")) {
            allMoves(move, row - 1, column);
        } else {
            System.err.println("To use this function you need to set black or white color");
        }

    }

}
