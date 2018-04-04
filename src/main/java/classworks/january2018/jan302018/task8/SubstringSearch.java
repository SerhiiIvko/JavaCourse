package classworks.january2018.jan302018.task8;

import java.util.Scanner;

/**
 * 8.Запросить у пользователя строку. Запросить подстроку, проверить содержит ли строка введенную подстроку. Выполнить
 * задание двумя способами:
 * a.С использованием методов класса String
 * b.Без использования методов класса String
 */
public class SubstringSearch {
    public static void main(String[] args) {
        System.out.println("Input your string");
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        System.out.println("Input your substring");
        String userSubString = scanner.nextLine();
        scanner.close();

        userString = userString.toLowerCase();
        userSubString = userSubString.toLowerCase();
        if (userString.length() < userSubString.length()) {
            System.out.println("Incorrect input");
            return;
        }
        boolean isStringContainSubstring = userString.contains(userSubString);
        System.out.println(isStringContainSubstring);
        System.out.println();
        char[] userStringCharArray = userString.toCharArray();
        char[] subStringCharArray = userSubString.toCharArray();
        int expectedCoincidenceStartIndex = 0;
        int currentIndex = 0;
        isStringContainSubstring = false;
        while (expectedCoincidenceStartIndex <= userStringCharArray.length - subStringCharArray.length && currentIndex <
                subStringCharArray.length) {
            if (userStringCharArray[expectedCoincidenceStartIndex + currentIndex] == subStringCharArray[currentIndex]) {
                currentIndex++;
                if (currentIndex == subStringCharArray.length) {
                    isStringContainSubstring = true;
                    break;
                }
            } else {
                expectedCoincidenceStartIndex++;
                currentIndex = 0;
            }
        }
        System.out.println(isStringContainSubstring);
    }
}