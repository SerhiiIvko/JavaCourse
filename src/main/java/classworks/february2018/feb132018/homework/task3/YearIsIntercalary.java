package classworks.february2018.feb132018.homework.task3;

import java.util.Scanner;

/**
 * Напишите метод, чтобы проверить, является ли год (целое число), введенным пользователем, високосным годом или нет.
 * Ожидаемый результат:
 * Введите год: 2017
 * false
 */
public class YearIsIntercalary {
    public static void main(String[] args) {
        System.out.println("Input year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();
        System.out.println(getIsYearIntercalary(year));
    }

    public static boolean getIsYearIntercalary(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}