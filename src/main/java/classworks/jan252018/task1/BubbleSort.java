package classworks.jan252018.task1;

/**
 * Bubble sort array
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int tmp;
        boolean isSorted = false;
        //first algorytm bubble sort
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println();
        //other algorytm bubble sort
        System.out.println("Next algoritm sorting array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.print(array[i] + " ");
        }
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] <= array[j - 1]) {
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println();
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
    }
}
