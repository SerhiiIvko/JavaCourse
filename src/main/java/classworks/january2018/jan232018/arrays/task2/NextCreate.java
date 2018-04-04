package classworks.january2018.jan232018.arrays.task2;

/**
 * 2.Создать массив целых чисел на 20 элементов. Заполнить его значениями от 1 до 20 по возрастающей.
 * Вывести его значения на экран.
 */
public class NextCreate {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
    }
}
