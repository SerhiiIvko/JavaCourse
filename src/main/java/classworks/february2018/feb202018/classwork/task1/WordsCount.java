package classworks.february2018.feb202018.classwork.task1;

import java.util.Scanner;

public class WordsCount {
    public static void getCountWord(String text) {
        char space = ' ';
        int counter = 1;
        text = text.trim();
        char[] array = text.toCharArray();
        if (text.isEmpty()) {
            System.out.println("Строка пустая");
            return;
        }
        for (char anArray : array) {
            if (anArray == space) {
                counter++;
            }
        }
        System.out.println("Слов в тексте " + counter);
    }

    public static void main(String[] args) {
        System.out.println("Enter your text here:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();
        getCountWord(text);
    }
}