package classworks.january2018.jan232018.arrays.task11;

/**
 * Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от -20 до 10.
 * Вывести массив на экран. Вывести количество положительных чисел в массиве и их индексы (аналогично предыдущему примеру).
 */
public class PositiveCount {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 32) - 21);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int countPositives = 0;
        int index;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPositives++;
            }
        }
        System.out.println();
        System.out.println("Количество положительных чисел: " + countPositives);
        System.out.print("Индексы положительных чисел в массиве: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                index = i;
                System.out.print(index + ", ");
            }
        }
    }
}
