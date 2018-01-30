package classworks.jan302018.task1;

import java.util.Arrays;

/**
 * 1.Дано 10 целых чисел. Выяснить:
 * a.Верно ли, что сумма тех из них, которые больше 20, превышает 100.
 * b.Верно ли, что сумма тех из них, которые меньше 50, есть четное число.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 55);
        }
        System.out.println(Arrays.toString(arr));
        boolean isMore = false;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 20) {
                sum += arr[i];
            }
        }
        if (sum > 100) {
            isMore = true;
        }
        System.out.println(isMore);
        System.out.println("Sum is " + sum);
        System.out.println(Arrays.toString(arr));

        sum = 0;
        boolean isSumEven = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 50) {
                sum += arr[i];
            }
        }
        if (sum % 2 == 0) {
            isSumEven = true;
        }
        System.out.println("Sum is " + sum);
        System.out.println(isSumEven);
    }
}
