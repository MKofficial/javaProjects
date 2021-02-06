package programko_rak.dcv;

/**
 * @author Matthew Kriz
 * @version 1.0.1
 * @since 14.10.2020
 */
public class PrimeNum {
    private static boolean isPrimeNum(int n) {
        boolean flag = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
