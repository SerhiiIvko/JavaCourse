package classworks.feb062018.task6;

import java.util.Arrays;

/**
 * Created by ivko on 06.02.18.
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 6, 9, 2, 1, 3, 4};
        int j;
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                tmp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;

                while (j > 0 && tmp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}