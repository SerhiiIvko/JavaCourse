package independentWork.arrays.task2;

/**
 * Найти максимальный элемент массива.
 */
public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
