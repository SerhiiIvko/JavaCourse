package classworks.jan232018.arrays.task7;

/**
 * 7.Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от 0 до 10.
 * Вывести на экран массив в обратном порядке.
 */
public class SwapArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 11));
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
