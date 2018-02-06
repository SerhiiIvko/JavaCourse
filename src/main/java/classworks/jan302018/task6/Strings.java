package classworks.jan302018.task6;

import java.util.Scanner;

/**
 * 6.Дано слово. Все данные в задании запрашиваем у пользователя. Вывести на экран:
 * a.Его третий символ
 * b.Его последний символ
 * c.Вывести на экран его k-символ
 * d.Посчитать сколько раз встречается m-символ
 */
public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input word");
        String word = scanner.nextLine();
        System.out.println("Input type of symbol");
        String stringToSymbol = scanner.nextLine();
        System.out.println("Input index of symbol");
        int index = scanner.nextInt();
        scanner.close();
        if (index < 0 || index > word.length()) {
            System.out.println("Incorrect input");
            return;
        }
        char symbol;
        if (stringToSymbol.length() == 1) {
            symbol = stringToSymbol.charAt(0);
        } else {
            System.out.println("Incorrect input");
            return;
        }
        int charCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (symbol == word.charAt(i)) {
                charCount++;
            }
        }
        System.out.println("a. Его третий символ " + word.charAt(2));
        System.out.println("b. Его последний символ " + word.charAt(word.length() - 1));
        System.out.println("c. его k-символ " + word.charAt(index));
        System.out.println("d. " + symbol + "-символ встречается " + charCount + " раз");
    }
}
