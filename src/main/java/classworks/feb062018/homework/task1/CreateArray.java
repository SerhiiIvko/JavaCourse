package classworks.feb062018.homework.task1;

import java.util.Arrays;

/**
 * 1)Создайте массив состоящий из 10 элементов используя класс Random, отсортируйте его с помощью сортировки пузырьком
 * по убыванию.
 */
public class CreateArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Current array:");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > 0; j--) {
                if (array[j] > array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        System.out.println("Sorted by decrease array:");
        System.out.println(Arrays.toString(array));
    }
}