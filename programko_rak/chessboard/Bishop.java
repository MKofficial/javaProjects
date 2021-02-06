package programko_rak.chessboard;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 01/02/2021
 */
public class Bishop {
    private final Chessboard chessboard;
    private final int row;
    private final int column;

    /**
     * @param chessboard Select a chessboard to place a knight
     * @param row        X position on which a knight will be placed
     * @param column     Y position on which a knight will be placed
     */
    public Bishop(Chessboard chessboard, int row, int column) {
        this.chessboard = chessboard;
        this.row = row;
        this.column = column;
    }

    public Bishop(Chessboard chessboard) {
        this(chessboard, 0, 0);
    }

    /**
     * Recursive function finding number of essential movements
     * to go from starting position to every possible position.
     * @param move   Number of first move (usually 0)
     * @param row    Current X position of a knight
     * @param column Current Y position of a knight
     */
    public void allMoves(int move, int row, int column) {
        if (row < 0 || column < 0 || row >= chessboard.max || column >= chessboard.max) {
            return;
        }
        if (chessboard.fields[row][column] <= move) {
            return;
        }

        chessboard.fields[row][column] = move;

        for (int i = 1; i < chessboard.max; i++) {
            allMoves(move + 1, row + i, column + i);
        }

        for (int i = 1; i < chessboard.max; i++) {
            allMoves(move + 1, row + i, column - i);
        }

        for (int i = 1; i < chessboard.max; i++) {
            allMoves(move + 1, row - i, column + i);
        }

        for (int i = 1; i < chessboard.max; i++) {
            allMoves(move + 1, row - i, column - i);
        }
    }
}
