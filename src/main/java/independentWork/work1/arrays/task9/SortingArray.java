package independentWork.work1.arrays.task9;

import java.util.Arrays;

/**
 * Отсортировать массив (пузырьком (Bubble), выбором (Select), вставками (Insert))
 */
public class SortingArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("Unsorted array: ");
        System.out.print(Arrays.toString(arr));
        System.out.println();
        int tmp;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] <= arr[j - 1]) {
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("Bubble sort: ");
        System.out.print(Arrays.toString(arr));
        System.out.println();

        for (int j = 1; j <= arr.length - 1; j++) {
            int tmp1 = arr[j];
            for (int i = j - 1; i >= 0 && arr[i] > tmp1; i--) {
                arr[i + 1] = arr[i];
                arr[i] = tmp1;
            }
        }
        System.out.println("Insertion sort: ");
        System.out.println(Arrays.toString(arr));

        for (int min = 0; min < arr.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }
            int tmp2 = arr[min];
            arr[min] = arr[least];
            arr[least] = tmp2;
        }
        System.out.println("Sorting by selection: ");
        System.out.println(Arrays.toString(arr));
    }
}