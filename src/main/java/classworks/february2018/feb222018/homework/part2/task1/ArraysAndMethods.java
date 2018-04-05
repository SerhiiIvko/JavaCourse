package classworks.february2018.feb222018.homework.part2.task1;

/**
 * Массивы + методы
 * Рандомно заполнить массив положительными значениями. Написать метод, который (1)находит количество элементов, значение
 * которых больше среднего арифметического (2) минимального (3) и максимального (4) элементов массива и вывести на консоль их
 * номера(напечатать).(5)
 */
public class ArraysAndMethods {
    public static int getCountNeedElements(int[] array, double average) {
        int count = 0;
        System.out.print("Indexes of elements which more average of min and max in array: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        return count;
    }

    public static int getMaxInArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int getMinInArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double average(double max, double min) {
        return (max + min) / 2;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        double average = average(getMaxInArray(array), getMinInArray(array));
        System.out.println("Count of it's elements = " + getCountNeedElements(array, average));
    }
}