package classworks.february2018.feb152018.homework.task3;

import java.util.Scanner;

/**
 * 3)Даны два натуральных числа. Выяснить, в каком из них сумма цифр больше.
 * Определить метод для расчета суммы цифр натурального числа.
 */
public class NumbersSum {

    public static long getSumDigits(long number) {
        long division = 10;
        long sum = 0;
        while ((number / division) >= 10) {
            division *= 10;
        }
        long tmp;
        if (number > 0) {
            do {
                tmp = number / division;
                number -= (tmp * division);
                division /= 10;
                sum += tmp;
            }
            while (division > 0);
        } else {
            System.out.println("Incorrect input");
        }
        return sum;
    }

    private static long readNumber(Scanner scanner, String inviteText) {
        long number = -1;
        System.out.println(inviteText);
        while (number < 0) {
            if (!scanner.hasNextLong()) {
                System.out.println("Input only natural positive digits!");
                scanner.next();
            } else {
                number = scanner.nextLong();
                if (number < 0) {
                    System.out.println("Negative numbers are not allowed!");
                }
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number1 = readNumber(scanner, "Input first number: ");
        long number2 = readNumber(scanner, "Input second number: ");
        if (getSumDigits(number1) > getSumDigits(number2)) {
            System.out.println("Sum of digits first number is " + getSumDigits(number1) + " and it more than sum of " +
                    "digits second number " + getSumDigits(number2));
        } else if (getSumDigits(number1) == getSumDigits(number2)) {
            System.out.println("Sum of digits first number is " + getSumDigits(number1) +
                    " and second number " + getSumDigits(number2) + " are equals.");
        } else {
            System.out.println("Sum of digits second number is " + getSumDigits(number2) + " and it more than sum of " +
                    "digits first number " + getSumDigits(number1));
        }
    }
}