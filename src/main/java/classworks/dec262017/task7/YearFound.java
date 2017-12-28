package classworks.dec262017.task7;

import java.util.Scanner;

/**
 * 6.Определить кол-во дней в году, который вводит пользователь.
 * Дополнительная информация: Високосными годами являются все года делящиеся нацело на 4 за исключением столетий
 * (которые делятся нацело на 400).
 */
public class YearFound {
    public static void main(String[] args) {
        System.out.println("Input yaear");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        if (year < 0) {
            System.out.println("Incorrect input");
            return;
        }

        System.out.println((year % 4 == 0 || year % 400 == 0) && year % 100 != 0 ? "високосный" : "не високосный");
    }
}
