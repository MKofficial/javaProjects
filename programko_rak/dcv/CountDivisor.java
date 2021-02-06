package programko_rak.dcv;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 14.10.2020
 */
public class CountDivisor {
    private static int countDivisor(int n) {
        int result = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                result++;
            }
        }
        return result;
    }

    private static int countDivisorRecursive(int n) {
        //Todo: try to think about it
        return 0;
    }
}
