package independentWork.work1.arrays.task3;

/**
 * Найти индекс минимального элемента массива
 */
public class FoundIndexMax {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int min = arr[0];
        int indexOfMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indexOfMin = i;
            }
        }
        System.out.println(min);
        System.out.println(indexOfMin);
    }
}
