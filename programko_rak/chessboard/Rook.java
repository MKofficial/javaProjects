package programko_rak.chessboard;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 01/02/2021
 */
public class Rook {
    private final Chessboard chessboard;
    private final int row;
    private final int column;

    /**
     * @param chessboard Select a chessboard to place a knight
     * @param row        X position on which a knight will be placed
     * @param column     Y position on which a knight will be placed
     */
    public Rook(Chessboard chessboard, int row, int column) {
        this.chessboard = chessboard;
        this.row = row;
        this.column = column;
    }

    public void allMoves(int move, int row, int column) {
        if (row < 0 || column < 0 || row >= chessboard.max || column >= chessboard.max || move >= chessboard.fields[row][column]) {
            return;
        }
        if (move == 0) {
            chessboard.fields[row][column] = move;
        }

        //todo: improve this algorithm
        boolean flag = true;
        for (int i = 0; i < chessboard.max; i++) {
            if (row + i < chessboard.max &&  chessboard.fields[row + i][column] == 0) {
                flag = false;
                break;
            }
            if (row - i >= 0 &&  chessboard.fields[row - i][column] == 0) {
                flag = false;
                break;
            }
            if (column - i >= 0 && chessboard.fields[row][column - i] == 0) {
                flag = false;
                break;
            }
            if (column + i < chessboard.max && chessboard.fields[row][column + i] == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            move = 2;
        }

        chessboard.fields[row][column] = move;

        if (move == 0) {
            move++;
        }

        allMoves(move, row + 1, column);
        allMoves(move, row - 1, column);
        allMoves(move, row, column - 1);
        allMoves(move, row, column + 1);
    }
}
