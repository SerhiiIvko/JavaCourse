package independentWork.work1.arrays.task8;

import java.util.Arrays;

/**
 * Поменять местами первую и вторую половину массива,
 * например, для массива 1 2 3 4, результат 3 4 1 2
 */
public class InvertHalfsOfArray {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));

        int tmp;
        for (int i = 0; i < arr.length / 2; i++) {
            tmp = arr[arr.length / 2 + i];
            arr[arr.length / 2 + i] = arr[i];
            arr[i] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
