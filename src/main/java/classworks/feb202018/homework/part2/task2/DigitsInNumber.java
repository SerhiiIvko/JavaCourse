package classworks.feb202018.homework.part2.task2;

import java.util.Scanner;

/**
 * Написать рекурсивную функцию:
 * а) вычисления суммы натурального числа;
 * б) вычисления количества цифр натурального числа;
 */
public class DigitsInNumber {
    public static int getSumDigits(int number) {
        int sum = number % 10;
        return ((number == 0) ? 0 : sum + getSumDigits(number / 10));
    }

    public static int countOfDigits(int number) {
        int count = 0;
        if (number == 0) {
            return 1;
        } else if (number / 10 > 0) {
            count++;
        }
        return count + countOfDigits(number / 10);
    }

    private static int readNumber(Scanner scanner, String inviteText) {
        int number = -1;
        System.out.println(inviteText);
        while (number < 0) {
            if (!scanner.hasNextInt()) {
                System.out.println("Input only positive digits!");
                scanner.next();
            } else {
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Number must be positive!");
                }
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = readNumber(scanner, "Input number");
        scanner.close();
        System.out.println("Sum of digits in number = " + getSumDigits(number));
        System.out.println("Count of digits in number = " + countOfDigits(number));
    }
}