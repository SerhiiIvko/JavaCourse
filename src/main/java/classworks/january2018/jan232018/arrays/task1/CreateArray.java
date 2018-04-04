package classworks.january2018.jan232018.arrays.task1;

/**
 * 1.Создать массив целых чисел на 4 элемента. Вывести его значения на экран.
 */
public class CreateArray {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 25;
            System.out.print(array[i] + " ");
        }
    }
}
