package classworks.february2018.feb062018.task5;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 6, 9, 2, 1, 3, 4};

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    indexMin = j;

                }
            }
            if (i != indexMin) {
                int tmp = arr[i];
                arr[i] = arr[indexMin];
                arr[indexMin] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
