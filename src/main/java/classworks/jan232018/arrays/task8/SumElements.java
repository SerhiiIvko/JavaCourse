package classworks.jan232018.arrays.task8;

/**
 * 8.Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от 10 до 100.
 * Вывести массив на экран. Вывести сумму всех элементов массива.
 */
public class SumElements {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 91) + 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.print("Sum of elements is " + sum);
    }
}
