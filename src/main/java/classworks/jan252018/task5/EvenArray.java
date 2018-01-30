package classworks.jan252018.task5;

/**
 * Создать второй массив из четных элементов первого массива
 */
public class EvenArray {
    public static void main(String[] args) {
        int countEvens = 0;
        int[] arr1 = new int[20];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 20);
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                countEvens++;
            }
        }
        System.out.println("evens " + countEvens);

        int[] arr2 = new int[countEvens];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                arr2[index] = arr1[i];
                index++;
            }
        }
        for (int anArr2 : arr2) System.out.print(anArr2 + " ");
    }
}