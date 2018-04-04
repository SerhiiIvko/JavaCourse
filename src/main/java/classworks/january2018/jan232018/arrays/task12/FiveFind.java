package classworks.january2018.jan232018.arrays.task12;

/**
 * Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от 0 до 10.
 * Вывести массив на экран. Вывести сколько раз в массиве встречается число 5.
 */
public class FiveFind {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 11));
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int countFive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5) {
                countFive++;
            }
        }
        System.out.println("число 5 встречается в массиве " + countFive + " раз");
    }
}
