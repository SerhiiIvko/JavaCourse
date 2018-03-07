package independentWork.lab1.task3;

import java.util.Arrays;

/**
 * Создать массив из 12 случайных целых чисел из отрезка *-15;15].
 * Определите какой элемент является в этом массиве максимальным и
 * сообщите индекс его последнего вхождения в массив.
 */
public class Array {
    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30) - 15;
        }
        System.out.println(Arrays.toString(array));
        int max = array[array.length - 1];
        int index = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Max element in array is " + max + ", last inex of max is " + index);
    }
}