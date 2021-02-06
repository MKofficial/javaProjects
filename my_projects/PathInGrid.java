package my_projects;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 04/02/2021
 */
public class PathInGrid {

    private static int findWays(int row, int column) {
        if (row == 1 || column == 1) {
            return 1;
        }
        return findWays(row - 1, column) + findWays(row, column - 1);
    }
}
