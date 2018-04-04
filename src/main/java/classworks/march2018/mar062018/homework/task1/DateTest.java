package classworks.march2018.mar062018.homework.task1;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = readNumber(scanner, "Input month");
        int day = readNumber(scanner, "Input day");
        int year = readNumber(scanner, "Input year");
        scanner.close();

        Date date = new Date(month, day, year);

        date.displayDate();
    }

    private static int readNumber(Scanner scanner, String inviteText) {
        int number = -1;
        System.out.println(inviteText);
        while (number < 0) {
            if (!scanner.hasNextInt()) {
                System.out.println("Input only natural positive digits!");
                scanner.next();
            } else {
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Negative numbers are not allowed!");
                }
            }
        }
        return number;
    }
}