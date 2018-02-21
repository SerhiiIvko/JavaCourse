package classworks.feb202018.homework.part1.task3;

/**
 * Написать рекурсивную функцию для вычисления индекса максимального элемента массива из n элементов.
 */
public class IndexMaxInArray {
    public static int getIndexOfMaxElement(int[] array, int index) {
        int count;
        int tmp = index - 1;
        if (tmp == 0) {
            return tmp;
        } else {
            count = getIndexOfMaxElement(array, tmp);
            return array[tmp] > array[count] ? tmp : count;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Index of max value in array is " + getIndexOfMaxElement(array, array.length - 1));
    }
}