package classworks.feb202018.homework.part1.task2;

/**
 * 2)Написать рекурсивную функцию для вычисления максимального элемента массива из n элементов.
 */
public class MaxInArray {
    public static int getMaxInArray(int[] array, int index) {
        return ((index > 0) ? Math.max(array[index], getMaxInArray(array, index - 1)) : array[0]);
    }

    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Max value is " + getMaxInArray(array, array.length - 1));
    }
}