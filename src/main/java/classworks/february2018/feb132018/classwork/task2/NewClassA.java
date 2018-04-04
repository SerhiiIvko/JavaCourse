package classworks.february2018.feb132018.classwork.task2;

import java.util.Random;

public class NewClassA {

    public static void main(String[] args) {
        FirstMethod.hello();

        int[] array = createRandomArray(10, 100);
        printArray(array);
        System.out.println(getSumArray(array));
    }

    static int[] createRandomArray(int count, int max) {
        int[] arr = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            arr[i] = random.nextInt(max);
        }
        return arr;
    }

    static int getSumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}