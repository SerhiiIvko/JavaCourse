package classworks.december2017.dec262017.task4;

import java.util.Scanner;

/**
 * 3.Дано двузначное число. Определить:
 * a.Является ли сумма его цифр двузначным числом
 * b.Больше ли числа a сумма его цифр
 */
public class TwoDigitsSum {
    public static void main(String[] args) {
        System.out.println("Input two-digits number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int a = (int) (Math.random() * 99);

        if (number < 10 || number > 99) {
            System.out.println("Incorrect input");
            return;
        }

        if (((number % 10) + (number / 10)) > 9 && ((number % 10) + (number / 10)) < 100) {
            System.out.println("Sum of digits is two-digits value");
        } else {
            System.out.println("Sum of digits is not two-digits value");
        }
        if (((number % 10) + (number / 10)) > a) {
            System.out.println("Sum of number digits are bigger " + a);
        } else {
            System.out.println("Sum of number digits are smaller or = " + a);
        }
    }
}

