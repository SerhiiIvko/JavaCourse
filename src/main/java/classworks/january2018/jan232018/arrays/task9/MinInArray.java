package classworks.january2018.jan232018.arrays.task9;

/**
 * 9.Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от -10 до 10.
 * Вывести массив на экран. Найти наименьшее значение и его индекс.
 */
public class MinInArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 21) - 11);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("Max element in array is " + min + ", index of max is " + index);
    }
}
