package classworks.january2018.jan252018.task6;

/**
 * Среднее арифметическое элементов массива
 */
public class AverageArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        double average = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            average = sum / array.length;
        }
        System.out.println("average is " + average);
    }
}