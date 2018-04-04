package classworks.january2018.jan232018.arrays.task3;

/**
 * 3.Создать массив целых чисел на 4 элемента. Заполнить его значениями от 10 до 20.
 * Поменять местами первый и последний элемент, а так же второй и третий.
 */
public class ArrayNext {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10 + (Math.random() * 10));
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("After changeField elements: ");
        int tmp = array[array.length - 1];
        array[array.length - 1] = array[0];
        array[0] = tmp;
        tmp = array[1];
        array[1] = array[array.length - 2];
        array[array.length - 2] = tmp;
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }
}
