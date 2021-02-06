package programko_rak.dcv;

import java.util.ArrayList;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 11.11.2020
 */
public class Field {

    public static void exchangeElements1(int[] ints) {
        for (int i = 0; i < ints.length / 2; i++) {
            int temp = ints[i];
            ints[i] = ints[ints.length - i - 1];
            ints[ints.length - i - 1] = temp;
        }
    }

    public static int sumOfElements(int[] ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }

    public static void bubbleSort(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            while (ints[i] > ints[ints.length - (ints.length + 1)]) {

            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
    }
}
