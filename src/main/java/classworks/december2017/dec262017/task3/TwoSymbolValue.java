package classworks.december2017.dec262017.task3;

import java.util.Scanner;

/**
 * C2.Дано двузначное число. Определить:
 * a.Какая из его цифр больше: первая или вторая
 * b.Одинаковы ли его цифры
 */
public class TwoSymbolValue {
    public static void main(String[] args) {
        System.out.println("Input 2-digits number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (number < 10 || number > 99) {
            System.out.println("Incorrect input");
            return;
        }

        if (number / 10 > number % 10) {
            System.out.println("First digit is bigger");
        } else if (number % 10 == number / 10) {
            System.out.println("First digit = second digit");
        } else {
            System.out.println("Second digit is bigger");
            System.out.println("Digits of number are different");
        }
    }
}
