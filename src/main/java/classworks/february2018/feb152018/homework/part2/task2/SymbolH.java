package classworks.february2018.feb152018.homework.part2.task2;

import java.util.Scanner;

/**
 * Даны два предложения на английском языке. Найти общее количество букв h в них. (
 * Определить метод для расчета количества букв h в предложении.)
 */
public class SymbolH {

    static void countHinText(String text) {
        char h = 'h';
        int counter = 0;
        text = text.toLowerCase();
        char[] array = text.toCharArray();

        for (char anArray : array) {
            if (anArray == h) {
                counter++;
            }
        }
        System.out.println("Буква 'h' встречается в тексте " + counter + " раз");
    }

    public static void main(String[] args) {
        System.out.println("Input your first sentence");
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        System.out.println("Input your second sentence");
        String text2 = scanner.nextLine();
        scanner.close();
        countHinText(text1);
        countHinText(text2);
    }
}