package classworks.february2018.feb062018.task4;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 6, 9, 2, 1, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
