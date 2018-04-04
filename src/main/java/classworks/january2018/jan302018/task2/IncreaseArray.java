package classworks.january2018.jan302018.task2;

import java.util.Arrays;

/**
 * 2.Дан массив пяти целых чисел определить. Увеличить размер массива в два раза. Последние 5 элементов должны хранить
 * нули. Выполнить задание с использованием одного цикла и метода Arrays.toString() для вывода массива.
 */
public class IncreaseArray {
    public static void main(String[] args) {
        int[] array1 = {5, 15, 10, 11, 42};
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[array1.length * 2];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println(Arrays.toString(array2));
    }
}
