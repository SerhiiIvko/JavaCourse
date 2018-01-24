package classworks.jan232018.arrays.task5;

/**
 * 5.Дан массив:
 * a.Все его элементы увеличить в два раза.
 * b.Умножить все элементы на последний элемент.
 */
public class InArrayDo {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("Вывод массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 10));
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("a. Все его элементы увеличить в два раза: ");
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("b. Умножить все элементы на последний элемент: ");
        for (int j = 0; j < array.length; j++) {
            array[j] *= array[array.length - 1];
            System.out.print(array[j] + " ");
        }
    }
}
