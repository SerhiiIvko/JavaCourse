package classworks.april.apr162018.homework.task1;

import java.util.Scanner;

/**
 * Created by ivko on 17.04.18.
 */
public class LinkedRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfLikedList = scanner.nextInt();
        int startRange = scanner.nextInt();
        int endRange = scanner.nextInt();
        scanner.close();
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addElement(sizeOfLikedList, startRange, endRange);
        System.out.println(linkedList.toString());
    }
}