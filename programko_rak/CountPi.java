package programko_rak;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 21.10.2020
 */
public class CountPi {

    private static double countPi() {
        double result = 0;
        boolean flag = true;
        for (int i = 1; i < Integer.MAX_VALUE; i+= 2) {
            if (flag) {
                result += 4.0 / i;
                flag = false;
            } else {
                result -= 4.0 / i;
                flag = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countPi());
    }

}