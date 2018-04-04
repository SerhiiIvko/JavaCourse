package classworks.march2018.mar272018.homework.task;

/**
 * Создать объект класса Одномерный массив, используя класс Массив. Методы: создать, вывести на консоль,
 * выполнить операции (сложить, вычесть, перемножить).
 */
public class ArrayRunner {
    public static void main(String[] args) {
        Array array = new Array();
        int[] arr = array.createArray(5);
        array.printArray(arr);
        System.out.println(array.getSumElements(arr));
        System.out.println(array.getDifferenceElements(arr));
        System.out.println(array.getMultiplyElements(arr));
    }
}