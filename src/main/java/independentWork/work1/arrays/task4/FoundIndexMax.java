package independentWork.work1.arrays.task4;

/**
 * Найти индекс максимального элемента массива
 */
public class FoundIndexMax {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int max = arr[0];
        int indexOfMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexOfMax = i;
            }
        }
        System.out.println("Maximum in array is " + max);
        System.out.println("Index of maximum in array is " + indexOfMax);
    }
}
