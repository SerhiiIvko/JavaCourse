package independentWork.work1.arrays.task5;

/**
 * Посчитать сумму элементов массива с нечетными индексами
 */
public class SumOfNotEvenIndex {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 50);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int sumOfNotEvenIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sumOfNotEvenIndex = sumOfNotEvenIndex + arr[i];
            }
        }
        System.out.println(sumOfNotEvenIndex);
    }
}
