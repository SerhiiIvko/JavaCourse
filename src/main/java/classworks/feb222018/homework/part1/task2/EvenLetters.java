package classworks.feb222018.homework.part1.task2;

import java.util.Scanner;

/**
 * Пользователь вводит слово. Сделать проверку на то чтобы слово состояло из четного числа букв.
 * Поменять местами его половины.
 */
public class EvenLetters {
    public static void main(String[] args) {
        System.out.println("Input word");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();
        if (string.length() % 2 == 0) {
            System.out.println("Word contain even count of letters");
            string = (string.substring(string.length() / 2, string.length()).concat(string.substring(0, string.length() / 2)));
            System.out.println("New string " + string);
        } else {
            System.out.println("Word contain odd count of letters");
        }
    }
}