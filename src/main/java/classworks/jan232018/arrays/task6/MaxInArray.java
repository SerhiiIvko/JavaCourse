package classworks.jan232018.arrays.task6;

/**
 * 6.Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от 0 до 10.
 * Вывести массив на экран. Найти наибольшее значение и его индекс.
 */
public class MaxInArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 11));
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Max element in array is " + max + ", index of max is " + index);
    }
}
