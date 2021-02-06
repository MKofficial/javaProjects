package programko_rak.dcv;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 07.10.2020
 */
public class NumMultiplication {
    private static int multiplicationToN(int n) {
        if (n == 1) {
            return 1;
        }
        return n * multiplicationToN(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(multiplicationToN(6));
    }
}
