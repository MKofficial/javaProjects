package my_projects;

/**
 * This program finds the biggest divisor of two given numbers.
 *
 * @since 2020-18-09
 * @author Matthew Kriz
 * @version 1.0.0
 */

public class biggest_divisor {
    public static void main(String[] args) {
        System.out.println(biggestForLoop(48, 16));
    }

    /**
     * This method uses an <b>iterative algorithm - for loop</b> to find the biggest divisor.
     *
     * @param num1 First required num
     * @param num2 Second required num
     * @return     An integer containing the biggest divisor of parameters. If there is not any, it will return 0.
     */
    private static int biggestForLoop(int num1, int num2) {
        for (int i = num1; i > 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i ;
            }
        }
        return 0;
    }

    /**
     * This method uses an <b>iterative algorithm - while loop</b> to find the biggest divisor.
     *
     * @param a  First required num
     * @param b  Second required num
     * @return   An integer containing the smallest divisor of parameters
     */
    private static int biggestWhileLoop(int a, int b) {
        int c;
        while (b != 0) {
            c = b;
            b = a % b;
            a = c;
        }
        return a;
    }

    /**
     * This method uses an <b>recursive algorithm</b> to find the biggest divisor
     *
     * @param num1  First required num
     * @param num2  Second required num
     * @return   An integer containing the biggest divisor of parameters..
     */
    private static int biggestRecursive(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return biggestRecursive(num2, num1 % num2);
    }


}
