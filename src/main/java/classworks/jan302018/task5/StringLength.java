package classworks.jan302018.task5;

import java.util.Scanner;

/**
 * 5.Запрашивать у пользователя стоки (5 строк). После введения каждой строки вывести размер строки или сообщение
 * «Строка пустая». (не используем условие string.length() == 0).
 */
public class StringLength {
    public static void main(String[] args) {
        System.out.println("Input strings: ");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        System.out.println(str1.isEmpty() ? "Строка пустая" : str1.length());
        String str2 = scanner.nextLine();
        System.out.println(str2.isEmpty() ? "Строка пустая" : str2.length());
        String str3 = scanner.nextLine();
        System.out.println(str3.isEmpty() ? "Строка пустая" : str3.length());
        String str4 = scanner.nextLine();
        System.out.println(str4.isEmpty() ? "Строка пустая" : str4.length());
        String str5 = scanner.nextLine();
        System.out.println(str5.isEmpty() ? "Строка пустая" : str5.length());
        scanner.close();
    }
}
