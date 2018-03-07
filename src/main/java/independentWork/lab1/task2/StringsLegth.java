package independentWork.lab1.task2;

import java.util.Scanner;

/**
 * Ввести n строк с консоли, найти самую короткую и самую длинную строки.
 * Вывести найденные строки и их длину.
 */
public class StringsLegth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input count of strings: ");
        int count = scanner.nextInt();
        System.out.println("Input string or sentence: ");
        String[] array = new String[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
            array[i] = array[i].trim();
        }
        scanner.close();
        System.out.println();
        String min = array[0];
        String max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < min.length()) {
                min = array[i];
            }
            if (array[i].length() > max.length()) {
                max = array[i];
            }
        }
        System.out.println("Shortest string is '" + min + "', it has length " + min.length());
        System.out.println("Longest string is '" + max + "', it has length " + max.length());
    }
}