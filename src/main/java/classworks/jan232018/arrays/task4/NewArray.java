package classworks.jan232018.arrays.task4;

/**
 * 4.Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от 10 до 50.
 * Вывести его значения на экран.
 */
public class NewArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10 + (Math.random() * 40));
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
