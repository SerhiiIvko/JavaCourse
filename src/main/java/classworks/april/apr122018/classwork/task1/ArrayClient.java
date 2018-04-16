package classworks.april.apr122018.classwork.task1;

import java.util.Scanner;

/**
 * Created by ivko on 12.04.18.
 */
public class ArrayClient {
    public static void main(String[] args) {
        System.out.println("Input size");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayHolder arrayHolder = new ArrayHolder(size);
        System.out.println("Input value and index");
        int value = scanner.nextInt();
        int index = scanner.nextInt();
        arrayHolder.insertToArray(value, index);
        scanner.close();
        arrayHolder.showArray();
    }
}