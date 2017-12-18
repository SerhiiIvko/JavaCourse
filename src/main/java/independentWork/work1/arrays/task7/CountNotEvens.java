package independentWork.work1.arrays.task7;

import java.util.Arrays;

/**
 * Посчитать количество нечетных элементов массива
 */
public class CountNotEvens {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));

        int countNotEvens = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                countNotEvens++;
            }
        }
        System.out.println("In this array not evens elements: " + countNotEvens);
    }
}
