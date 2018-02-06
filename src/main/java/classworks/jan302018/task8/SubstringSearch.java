package classworks.jan302018.task8;

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
//        boolean isStringContainSubstring = userString.contains(userSubString);
        boolean isStringContainSubstring = false;
        //System.out.println(isStringContainSubstring);
        System.out.println();

        int userStringIndex = 0;
        int userSubStringIndex = 0;
        int tmp;
        while (userStringIndex < userString.length() && userSubStringIndex < userSubString.length()) {
            if (userString.charAt(userStringIndex) == userSubString.charAt(userSubStringIndex)) {
                userSubStringIndex++;
                userStringIndex++;
                tmp = userStringIndex;
            } else {
                tmp = userStringIndex;
                userSubStringIndex = 0;
            }
            if (userString.charAt(tmp) == userSubString.charAt(userSubStringIndex)) {
                userSubStringIndex++;
                userStringIndex++;
                isStringContainSubstring = true;
            }
        }

        System.out.println(isStringContainSubstring);
    }
}