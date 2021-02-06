package programko_rak.dcv;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 02.12.2020
 */
public class InsertionSort {

    public static void insertionSort(int[] array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            int key = array[i];
            int num = i - 1;

            while (num > -1 && array[num] > key) {
                array[num + 1] = array[num];
                num--;
            }
            array[num + 1] = key;
        }
    }
}
