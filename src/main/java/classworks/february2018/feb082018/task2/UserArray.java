package classworks.february2018.feb082018.task2;

import java.util.Arrays;
import java.util.Scanner;

public class UserArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Input array size:");
            while (!scanner.hasNextInt()) {
                System.out.println("Input only positive digits!");
                scanner.next();
            }
            size = scanner.nextInt();
        } while (size <= 0);
        array = new int[size];
        System.out.println("Input elements:");
        for (int i = 0; i < array.length; i++) {
            do {
                while (!scanner.hasNextInt()) {
                    System.out.println("Input only positive digits!");
                    scanner.next();
                }
                array[i] = scanner.nextInt();
            } while (array[i] < 0);
        }
        scanner.close();
        System.out.println("Unsorted array: ");
        System.out.println(Arrays.toString(array));
        int j;
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                tmp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j > 0 && tmp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = tmp;
            }
        }
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(array));
    }
}