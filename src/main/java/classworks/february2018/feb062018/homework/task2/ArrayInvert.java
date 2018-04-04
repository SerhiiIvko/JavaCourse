package classworks.february2018.feb062018.homework.task2;

import java.util.Arrays;

/**
 * 2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
 * а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
 */
public class ArrayInvert {
    public static void main(String[] args) {
        System.out.println("Create and output array: ");
        int sizeArray = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                sizeArray++;
            }
        }
        int[] array = new int[sizeArray];
        for (int i = 1, j = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                array[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Reverse array by loop:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Reverse array by toString:");
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}