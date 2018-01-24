package classworks.jan232018.arrays.task10;

/**
 * 10.Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от -10 до 10.
 * Вывести массив на экран. Вывести количество отрицательных чисел в массиве и их индексы.
 * Например:
 * Количество отрицательных чисел: 5
 * Индексы чисел в массиве: 3, 6, 9.
 */
public class NegativesCount {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 22) - 11);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int countNegatives = 0;
        int index;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                countNegatives++;
            }
        }
        System.out.println();
        System.out.println("Количество отрицательных чисел: " + countNegatives);
        System.out.print("Индексы отрицательных чисел в массиве: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                index = i;
                System.out.print(index + ", ");
            }
        }
    }
}
