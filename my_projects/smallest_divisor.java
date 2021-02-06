package my_projects;

/**
 * This program is finding the smallest divisor of two integers.
 * There are 3 functions where each of them do the same thing in a different way.
 * For more information check the documentations below.
 *
 * @since 2020-16-09
 * @author Matthew Kriz
 * @version 1.0.0
 */

public class smallest_divisor {
    public static void main(String[] args) {
        int num = smallest(7, 35);
        if (num == 0) {
            System.out.println("There is not any united divisor");
        } else {
            System.out.println("The united divisor is " + num);
        }
    }

    /**
     * This method uses an <b>iterative algorithm - for loop</b> to find the smallest divisor.
     *
     * @param num1  First required num
     * @param num2  Second required num
     * @return      An integer containing the smallest divisor of parameters. If there is not any, it will return 0.
     */
    private static int smallest(int num1, int num2) {
        for (int i = 2; i <= Math.max(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return 0;
    }
}
