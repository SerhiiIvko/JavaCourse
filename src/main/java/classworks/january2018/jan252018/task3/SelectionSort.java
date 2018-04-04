package classworks.january2018.jan252018.task3;

/**
 * Selection sort array
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length - 1; i++) {
            int tmp1 = i;
            for (int j = tmp1 + 1; j < array.length; j++) {
                if (array[j] < array[tmp1]) {
                    tmp1 = j;
                }
            }
            int tmp2 = array[i];
            array[i] = array[tmp1];
            array[tmp1] = tmp2;
        }

        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
    }
}
