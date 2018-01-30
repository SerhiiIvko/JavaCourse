package classworks.jan252018.task4;

/**
 * Merge sort array
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] a1 = new int[5];
        int[] a2 = new int[5];
        int[] a3 = new int[10];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = (int) (Math.random() * 10);
            System.out.print(a1[i] + " ");
        }
        for (int i = 0; i < a2.length; i++) {
            a2[i] = (int) (Math.random() * 10);
            System.out.print(a2[i] + " ");
        }
        for (int i = 0; i < a3.length; i++) {
            a3[i] = (int) (Math.random() * 10);
            System.out.print(a3[i] + " ");
        }

    }
}
