package classworks.jan252018.task2;

/**
 * Insertion sort array
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.print(array[i] + " ");
        }

        int tmp;
        for (int i = 1; i <= array.length - 1; i++) {
            tmp = array[i];
            for (int j = i - 1; j >= 0 && array[j] > tmp; j--) {
                array[j + 1] = array[j];
                array[j] = tmp;
            }
        }
        System.out.println();

        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
    }
}
