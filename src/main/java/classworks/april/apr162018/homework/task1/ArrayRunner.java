package classworks.april.apr162018.homework.task1;

import java.util.Scanner;

/**
 * Создать две программы, которые реализуют следующий функционал для LinkedList и MyArrayList:
 * – В меню пользователь вводит размер коллекции
 * – Заполнить коллекцию случайными числами, диапазон пользователь вводит через консоль
 * – Вывести содержимое коллекции в консоль
 */
public class ArrayRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArrayList = scanner.nextInt();
        int startRange = scanner.nextInt();
        int endRange = scanner.nextInt();
        scanner.close();
        MyArrayList arrayList = new MyArrayList();
        arrayList.addElement(sizeOfArrayList, startRange, endRange);
        System.out.println(arrayList.toString());
    }
}