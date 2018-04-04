package classworks.january2018.jan302018.task3;

import java.util.Arrays;

/**
 * 3.Дан массив целых чисел 1, 2, 3, 4, 5. Используя метод Arrays.toString() вывести массив на экран без квадратных скобок.
 */
public class ArrayOutput {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        String arr2 = Arrays.toString(arr1);
        System.out.println(arr2.substring(1, arr2.length() - 1));
    }
}
